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
	int len=s.length();
	String s1,s2;
	s1=s2="";
	if(len%2!=0)
	{
	System.out.println("NO");
	}
	else
	{
	 s1=s.substring(0,len/2);
	 s2=s.substring(len/2);
	if(s1.equals(s2))
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
}