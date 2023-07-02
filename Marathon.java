import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.next());
        while(t-->0)
        {
        int a=Integer.parseInt(sc.next());
        int b=Integer.parseInt(sc.next());
        int c=Integer.parseInt(sc.next());
        int d=Integer.parseInt(sc.next());
        int s=0;
        if(b>a)
        {
        s++;
        }
        if(c>a)
        {
        s++;
        }
        if(d>a)
        {
        s++;
        }
        System.out.println(s);
        }
    }
}