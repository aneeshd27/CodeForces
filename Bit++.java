import java.util.*;
class Bit++
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0)
	{
	String s=sc.next();
	int sum=0;
	if(s.equals("X++"))
	{
	sum+=1;
	}
	if(s.equals("X--"))
	{
	sum-=1;
	}
	if(s.equals("--X"))
	{
	sum-=1;
	}
	if(s.equals("++X"))
	{
	sum+=1;
	}
	
	}
	System.out.println(sum);
	}
}