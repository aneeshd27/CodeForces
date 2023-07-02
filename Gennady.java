import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String s1[]=new String[5];
	int i,flg;
	flg=0;
	for(i=0;i<5;i++)
	{
	s1[i]=sc.next();
	}
	for(i=0;i<5;i++)
	{
	if(s1[i].contains(s))
	{
		flg=1;
	}
	}
	if(flg==1)
	{
	System.out.println("YES");
	}
	else
	{
	System.out.println("NO")
	}
	}
}