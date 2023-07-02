import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.next());
	int i,sum;
	sum=0;
	String s[]=new String[n];
	for(i=0;i<n;i++)
	{
	s[i]=sc.next();
	}
	for(i=0;i<n;i++)
	{
	if(s[i].equals("X++"))
	{
	sum+=1;
	}
	else if(s[i].equals("++X"))
	{
	sum+=1;
	}
	else if(s[i].equals("--X"))
	{
	sum-=1;
	}
	else if(s[i].equals("X--"))
	{
	sum-=1;
	}
	}
	System.out.println(sum);
	}
}