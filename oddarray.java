import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=Integer.parseInt(sc.nextLine());
	for(int i=1;i<=t;i++)
	{
	int n=Integer.parseInt(sc.nextLine());
	int a[]=new int[n];
	int sum=0;
	int j;
	for(j=0;j<n;j++)
	{
	a[j]=Integer.parseInt(sc.nextLine());
	}
	for(j=0;j<n;j++)
	{
	sum+=a[j];
	}
	if(sum%2!=0)
	{
	System.out.println("YES");
	}
	else
	{
	System.out.println("NO");
	}
	}
	}
}