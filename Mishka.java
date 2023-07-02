import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int m[]=new int[n];
        int c[]=new int [n];
        int c1,c2,i;
        c1=c2=0;
        for(i=0;i<n;i++)
        {
            m[i]=Integer.parseInt(sc.next());
            c[i]=Integer.parseInt(sc.next());
        }
        for(i=0;i<n;i++)
        {
            if(m[i]>c[i])
            {
                c1++;
            }
            else if(c[i]>m[i])
            {
                c2++;
            }
        }
        if(c1>c2)
        {
            System.out.println("Mishka");
        }
        else if(c1<c2)
        {
            System.out.println("Chris");
        }
        else
        {
            System.out.println("Friendship is magic!^^");
        }
    }
}