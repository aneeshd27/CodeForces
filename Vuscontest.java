import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.next());
	int m=Integer.parseInt(sc.next());
	int k=Integer.parseInt(sc.next());
	if(m>=n && k>=n)
	{
	System.out.println("Yes");
	}
	else
	{
	System.out.println("No");
	}
	}
}