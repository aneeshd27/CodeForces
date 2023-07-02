import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	long t=Long.parseLong(sc.next());
	while(t-->0)
	{
	long a=Long.parseLong(sc.next());
	long b=Long.parseLong(sc.next());
	int c=0;
	if(a%b==0)
	{
		System.out.println(0);
	}
	else 
	{
		System.out.println(b-(a%b));
	}
	}
	}
}