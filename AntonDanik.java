import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int len=Integer.parseInt(sc.next());
	String s=sc.next();
	int c1,c2;
	c1=c2=0;
	int i;
	char ch;
	for(i=0;i<len;i++)
	{
	ch=s.charAt(i);
	if(ch=='A')
	{
	c1++;
	}
	else if(ch=='D')
	{
	c2++;
	}
	}
	if(c1>c2)
	{
	System.out.println("Anton");
	}
	else if(c2>c1)
	{
	System.out.println("Danik");
	}
	else if(c1==c2)
	{
	System.out.println("Friendship");
	}
	}
}