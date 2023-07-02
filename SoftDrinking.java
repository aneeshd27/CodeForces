import java.lang.Math;
import java.util.*;


public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	
	int n=Integer.parseInt(sc.next());
	int k=Integer.parseInt(sc.next());
	int l=Integer.parseInt(sc.next());
	int c=Integer.parseInt(sc.next());
	int d=Integer.parseInt(sc.next());
	int p=Integer.parseInt(sc.next());
	int nl=Integer.parseInt(sc.next());
	int np=Integer.parseInt(sc.next());

	int td=k*l;
	int toast=td/n;
	int limet=c*d;
	int salt=p/np;
	System.out.println((Math.min(Math.min(toast,limet),salt))/n);

	}
}
1 4 5 5 3 10 3 1