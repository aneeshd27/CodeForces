import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int k=Integer.parseInt(sc.next());
	int n=Integer.parseInt(sc.next());
	int w=Integer.parseInt(sc.next());
	int i=1;
	int sum=0;
	while(i<=w)
	{
	sum+=(i*k);
	i++;
	}
	if(sum<=n)
	{
	System.out.println(0);
	}
	else
	{
	System.out.println(sum-n);
	}
	}
}