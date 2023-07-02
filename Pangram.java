import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int len=Integer.parseInt(sc.next());
	String s=sc.next();
	int i,c;
	c=0;
	for(i=1;i<s.length();i++)
	{
	if(s.charAt(i)!=s.charAt(i-1))
	{
	c++;
	}
	}
	if(c==len)
	{
	System.out.println("YES");
	}
	else
	{
	System.out.println("NO");
	}
	}
}