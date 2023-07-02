import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.next());
	int p=Integer.parseInt(sc.next());
	int i;
	int a[]=new int[p];
	for(i=0;i<p;i++)
	{
		a[i]=Integer.parseInt(sc.next());
	}
	int q=Integer.parseInt(sc.next());
	int b[]=new int[q];
	for(i=0;i<q;i++)
	{
	b[i]=Integer.parseInt(sc.next());
	}
	int c1,c2,c3,c4;
	int C1,C2,C3,C4;
	c1=c2=c3=c4=C1=C2=C3=C4=0;
	for(i=0;i<p;i++)
	{
	if(a[i]==1)
	{
	c1++;
	}
	else if(a[i]==2)
	{
	c2++;
	}
	else if(a[i]==3)
	{
	c3++;
	}
	else if(a[i]==4)
	{
	c4++;
	}
	}
	for(i=0;i<q;i++)
	{
	if(b[i]==1)
	{
	C1++;
	}
	else if(b[i]==2)
	{
	C2++;
	}
	else if(b[i]==3)
	{
	C3++;
	}
	else if(b[i]==4)
	{
	C4++;
	}
	}
	if((c1>0||C1>0)&&(c2>0||C2>0)&&(c3>0||C3>0)&&(c4>0 && C4>0))
	{
	System.out.println("I become the guy");
	}
	else
	{
	System.out.println("Oh,my Keyboard!");
	}
	}
}

