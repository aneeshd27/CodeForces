import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	if(Character.isUpperCase(s.charAt(0)))
	{
	System.out.println(s);
	}
	else 
	{
	System.out.println(Character.toUpperCase(s.charAt(0))+s.substring(1));
	}
	}
}