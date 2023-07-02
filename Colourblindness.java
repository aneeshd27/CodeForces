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
            String s1=sc.next();
            String s2=sc.next();
            int i,c;
            c=0;
            for(i=0;i<n;i++)
            {
                if(s1.charAt(i)==s2.charAt(i))
                {
                    c++;
                }
                if((s1.charAt(i)=='G' && s2.charAt(i)=='B')||(s1.charAt(i)=='B' && s2.charAt(i)=='G'))
                {
                    c++;
                }
            }
            if(c==n)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}