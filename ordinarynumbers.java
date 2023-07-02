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
	int rev,d,n1;
	n1=0;
	rev=d=0;
	int i=0;
	int c=0;
	for(i=1;i<=n;i++)
	{
		n1=i;
	while(i>0)
	{
	d=i%10;
	rev=(rev*10)+d;
	i=i/10;
	}
	if(rev==n1)
	{
	c++;
	}
	}
	System.out.println(c);
	}
	}
}