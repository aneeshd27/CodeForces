import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.next());
	String s=sc.next();
	int i,c;
	c=0;
	for(i=1;i<n;i++)
	{
		if(s.charAt(i)==s.charAt(i-1))
		{
		c++;
		}
	}
	System.out.println(c);
	}
}