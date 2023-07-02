import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int a[]=new int[n];
        int i,max;
        max=0;
        int sum=0;
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(sc.next());
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(i=0;i<n;i++)
        {
            sum+=(max-a[i]);
        }
        System.out.println(sum);
    }
}