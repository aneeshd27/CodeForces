import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int k=Integer.parseInt(sc.next());
        int a[]=new int[n];
        int i,c;
        c=0;
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(sc.next());
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>=a[k-1] && a[i]>0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}