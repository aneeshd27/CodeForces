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
            System.out.println(Math.max(0,Math.max(b,c)+1-a)+" "+Math.max(0,Math.max(a,c)+1-b)+" "+Math.max(0,Math.max(a,b)+1-c));

        }
    }
}