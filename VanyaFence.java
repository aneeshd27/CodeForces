import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.next());
	int h=Integer.parseInt(sc.next());
	int a[]=new int[n];
	int i;
	for(i=0;i<a.length;i++)
	{
	a[i]=Integer.parseInt(sc.next());
	}
	int sum=0;
	for(i=0;i<a.length;i++)
	{
	if(a[i]<=h)
	{
	sum+=1;
	}
	else if(a[i]>h)
	{
	sum+=2;
	}
	}
	System.out.println(sum);
	}
}