import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int c=0;
	int i;
	for(i=0;i<s.length();i++)
	{
	if(s.contains("QAQ"))
	{
	c++;
	}
	}
	System.out.println(c);
	}
}