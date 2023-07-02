import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int m=Integer.parseInt(sc.next());
        int a=Integer.parseInt(sc.next());
        int c1=n/a;
        int c2=m/a;
        if(n%a!=0)
        {
            c1++;
        }
        if(m%a!=0)
        {
            c2++;
        }
        System.out.println(c1*c2);
    }
}