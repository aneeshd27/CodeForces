import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int p[]=new int[n];
        int q[]=new int[n];
        int i,c;
        c=0;
        for(i=0;i<n;i++)
        {
            p[i]=Integer.parseInt(sc.next());
            q[i]=Integer.parseInt(sc.next());
        }
        for(i=0;i<n;i++)
        {
            if((p[i]<q[i])&&(q[i]-p[i])>=2)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}