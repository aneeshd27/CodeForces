import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a=Integer.parseInt(sc.next());
	int b=Integer.parseInt(sc.next());
	if(a>=b)
	{
		a=a-b;
		a=a/2;
		System.out.println(b+" "+a);
	}
	else
	{
		b=b-a;
		b=b/2;
		System.out.println(a+" "+b);
	}
	}
}