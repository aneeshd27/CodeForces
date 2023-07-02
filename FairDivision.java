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
            int a[]=new int[n];
            int i,c1,c2;
            c1=c2=0;
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(sc.next());
            }
            for(i=0;i<n;i++)
            {
                if(a[i]==1)
                {
                    c1++;
                }
                else if(a[i]==2)
                {
                    c2++;
                }
            }
            if(c1%2==0 && c2%2==0)
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