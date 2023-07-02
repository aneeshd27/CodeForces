import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a=Integer.parseInt(sc.next());
	int b=Integer.parseInt(sc.next());
	int c=0;
	while(a<=b)
	{
	a=a*3;
	b=b*2;
	c++;
	}
	System.out.println(c);
	}
}