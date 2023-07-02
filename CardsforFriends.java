import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.next());
        while(t-->0)
        {
        int w=Integer.parseInt(sc.next());
        int h=Integer.parseInt(sc.next());
        int n=Integer.parseInt(sc.next());
        int prod=0;
        int c=0;
        while(prod!=n)
        {
        if(w%2==0)
        {
        prod=(w/2)*h;
        c++;
        }
        else if(h%2==0)
        {
        prod=w*(h/2);
        c++;
        }
        }
        }
        if(c>=n)
        {
        System.out.println("YES");
        }
        else
        {
        System.out.println("NO");
        }

    }
}