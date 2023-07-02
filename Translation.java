import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String b=sc.next();
	String s="";
	char ch;
	int i;
	for(i=a.length()-1;i>=0;i--)
	{
		ch=a.charAt(i);
		s+=ch;
	}
	if(s.equals(b))
	{
	System.out.println("YES");
	}
	else
	{
	System.out.println("NO");
	}
	}
}