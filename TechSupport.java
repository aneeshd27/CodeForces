import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.next());
        while(t-->0)
        {
            int n=Integer.parseInt(sc.next());
            String s=sc.next();
            int i,c1,c2;
            c1=c2=0;
            for(i=0;i<n;i++)
            {
                if(s.charAt(i)=='Q')
                {
                    c1++;
                }
                else if(s.charAt(i)=='A')
                {
                    c2++;
                }
            }
            if(c1<=c2)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}