import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long a[]=new long[4];
        int i;
        long c=0;
        for(i=0;i<4;i++)
        {
            a[i]=Long.parseLong(sc.next());
        }
        Arrays.sort(a);
        for(i=1;i<4;i++)
        {

                if(a[i]==a[i-1])
                {
                    c++;
                }

        }
        System.out.println(c);
    }
}