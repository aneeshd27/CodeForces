import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.next());
        while(t-->0)
        {
            long n=Long.parseLong(sc.next());
            long i,c=0;
            for(i=n-1;i>=1;i--)
            {
                if(n==1)
                {
                    break;
                }
                if(n%i==0)
                {
                    n=n-i;
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}