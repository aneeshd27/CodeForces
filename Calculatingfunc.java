import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	long n=Long.parseLong(sc.next());
	long i,sum;
	sum=0;
	if(n%2==0)
	{
		sum=n/2;
	}
	else 
	{
		sum=(-1)*(n/2+1);
	}

	System.out.println(sum);
	}
}