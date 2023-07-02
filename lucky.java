import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=Integer.parseInt(sc.next());
	while(t-->0)
	{
	String s=sc.next();
	String s1=s.substring(0,3);
	String s2=s.substring(3);
	int n1=Integer.parseInt(s1);
	int n2=Integer.parseInt(s2);
	int sum1,sum2;
	sum1=sum2=0;
	while(n1>0)
	{
	sum1+=(n1%10);
	n1=n1/10;
	}
	while(n2>0)
	{
	sum2+=(n2%10);
	n2=n2/10;
	}
	if(sum1==sum2)
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