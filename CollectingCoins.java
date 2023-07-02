import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int t=Integer.parseInt(sc.next());
       while(t-->0)
       {
       long a=Long.parseLong(sc.next());
       long b=Long.parseLong(sc.next());
       long c=Long.parseLong(sc.next());
       long n=Long.parseLong(sc.next());
       
       int i,j,k;
       int c=0;
       for(i=1;i<=n;i++)
       {
       for(j=1;j<=n;j++)
       {
       for(k=1;k<=n;k++)
       {
       if(i+j+k==n &&(i+a==j+b)&&(j+b==k+c)&&(i+a==k+c))
       {
       c=1;
       break;
       }
       }
       }
       }
       if(c==1)
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