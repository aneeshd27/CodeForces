import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=Integer.parseInt(sc.next());
	while(t-->0)
	{
	int x=Integer.parseInt(sc.next());
	int i,sum,c;
	int x1=x%10;
	sum=c=0;
	int d=0;
	while(x>0)
	{
	d=x%10;
	c++;
	x=x/10;
	}
	System.out.println(((x1-1)*10)+c);
	}
	}
}