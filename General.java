import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int a[]=new int[n];
        int i,j,c;
        c=0;
        for(i=0;i<n;i++)
        {
        int min=i;
        for(j=i+1;j<n;j++)
        {
        if(a[j]<a[min])
        {
        min=j;
        }
        }
        int temp=a[min];
        a[min]=a[i];
        a[i]=temp;
        c++;
        }
        System.out.println(c);
    }
}