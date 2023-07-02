import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=Integer.parseInt(sc.next());
	while(t-->0)
	{
	int h=Integer.parseInt(sc.next());
	int m=Integer.parseInt(sc.next());
	System.out.println(((24-h)*60)-m);
	}
	}
}