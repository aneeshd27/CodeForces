import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int m=Integer.parseInt(sc.next());
        int a,b;
        int c=0;
        for(a=0;a<=n;a++)
        {
            for(b=0;b<=m;b++)
            {
                if((a*a)+b==n && a+(b*b)==m)
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}

