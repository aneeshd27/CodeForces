import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=Integer.parseInt(sc.next());
	while(t-->0)
	{
	int n=Integer.parseInt(sc.next());
	int c,i;
	c=0;
	for(i=1;i<=n;i++)
	{
	if((i%3!=0 ||i%10!=3)||(i%3!=0 && i%10!=3))
	{
	c++;
	}
	}
	System.out.println(c);
	c=0;
	}
	}
}