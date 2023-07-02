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
	int a[]=new int[2*n];
	int c,i;
	c=0;
	for(i=0;i<n-1;i+=2)
	{
	if(a[i]+a[i+1]%2==0 && a[i]!=a[i+1])
	{
	c++;
	}
	}
	if(c==n)
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