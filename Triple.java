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
            int i,flg;
            flg=0;
            int el=0;
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(sc.next());
            }
            Arrays.sort(a);
            for(i=0;i<n-2;i++)
            {
                if(a[i]==a[i+1] && a[i+1]==a[i+2] && a[i]==a[i+2])
                {
                    el=a[i];
                    flg=1;
                    break;
                }
            }
            if(flg==1)
            {
                System.out.println(el);
            }
            else
            {
                System.out.println(-1);
            }
        }
    }
}