import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int a[]=new int[n];
        int i,c;
        for(i=0;i<n;i++)
        {
        a[i]=Integer.parseInt(sc.next());
        }
        for(i=1;i<n;i++)
        {
        if(a[i]<=a[i-1])
        {
        c++;
        }
        }
        System.out.println(c);
    }
}