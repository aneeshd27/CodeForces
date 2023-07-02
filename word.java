import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int c1,c2;
	c1=c2=0;
	int i;
	char ch;
	for(i=0;i<s.length();i++)
	{
	ch=s.charAt(i);
	if(Character.isUpperCase(ch))
	{
	c1++;
	}
	else if(Character.isLowerCase(ch))
	{
	c2++;
	}
	}
	if(c1>c2)
	{
	System.out.println(s.toUpperCase());
	}
	else if(c1<=c2)
	{
	System.out.println(s.toLowerCase());
	}
	}
}