import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(sc.next());
            b[i]=Integer.parseInt(sc.next());
            c[i]=Integer.parseInt(sc.next());
        }
        int c1=0;
        for(i=0;i<n;i++)
        {
            if((a[i]==1 && b[i]==1)||(a[i]==1 && c[i]==1)||(b[i]==1 && c[i]==1)||(a[i]==1 && b[i]==1 && c[i]==1))
            {
                c1++;
            }
        }
        System.out.println(c1);
    }
}