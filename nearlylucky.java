import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	long n=Long.parseLong(sc.nextLine());
	long c=0;
	long d;
	long n1=n;
	while(n>0)
	{
	d=n%10;
	if(d==4 || d==7)
	{
	c++;
	}
	n=n/10;
	}
	if(c==4 ||c==7)
	{
	System.out.println("YES");
	}
	else
	{
		System.out.println("NO");
	}
	}
}