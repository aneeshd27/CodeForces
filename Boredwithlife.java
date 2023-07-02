import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a=Integer.parseInt(sc.next());
	int b=Integer.parseInt(sc.next());
	long f1,f2;
	f1=f2=1;
	int i,gcd;
	gcd=0;
	for(i=1;i<=a;i++)
	{
	f1*=i;
	}
	for(i=1;i<=b;i++)
	{
	f2*=i;
	}
	i=1;
	while(i<=Math.max(f1,f2))
	{
	if(f1%i==0 && f2%i==0)
	{
	gcd=i;
	}
	i++;
	}
	System.out.println(gcd);
	}
}