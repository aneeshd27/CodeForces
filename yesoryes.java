import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=Integer.parseInt(sc.nextLine());
	while(t-->0)
	{
	String s=sc.next();
	if(s.equalsIgnoreCase("YES"))
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