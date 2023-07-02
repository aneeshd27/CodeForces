import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.next());
	int k=Integer.parseInt(sc.next());
	int i=0;
	while(i<k)
	{
	if(n%10==0)
	{
	n=n/10;
	}
	else
	{
	n=n-1;
	}
	i++;
	}
	System.out.println(n);
	}
}