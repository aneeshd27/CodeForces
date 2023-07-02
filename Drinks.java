import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.next());
	int a[]=new int[n];
	int i,sum;
	sum=0;
	for(i=0;i<a.length;i++)
	{
	a[i]=Integer.parseInt(sc.next());
	}
	for(i=0;i<a.length;i++)
	{
	sum+=a[i];
	}
	System.out.println((double)sum/n);
	}
}