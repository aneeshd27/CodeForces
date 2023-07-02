import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.next());
        while(t-->0)
        {
            int n=Integer.parseInt(sc.next());
            int a[]=new int[n];
            int i;
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(sc.next());
            }
            int sum=0;
            for(i=0;i<n;i++)
            {
                sum+=a[i];
            }
            if(sum%n==0)
            {
                System.out.println(sum/n);
            }
            else
            {
                System.out.println((sum/n)+1);
            }
        }
    }
}