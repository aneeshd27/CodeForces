import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.next());
	int i,j,c1,c2;
	c1=c2=0;
	for(i=1;i<n;i++)
	{
	for(j=1;j<n;j++)
	{
	if(i%2==0)
	{
	c1++;
	}
	if(j%2==0)
	{
	c2++;
	}
	}
	if(c1>2 && c2>2)
	{
	System.out.println(i+" "+j);
	break;
	}
	}

	}
}