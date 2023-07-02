import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.next());
        while(t-->0)
        {
            long x=Long.parseLong(sc.next());
            long y=Long.parseLong(sc.next());
            long a=Long.parseLong(sc.next());
            long b=Long.parseLong(sc.next());
            long c=0,flg=-1;
            while(x!=y)
            {
                x=x+a;
                y=y-b;
                c+=1;
                if(x>y)
                {
                    flg=1;
                    break;
                }
            }
            if(flg==1)
            {
                System.out.println(-1);
            }
            else {
                System.out.println(c);
            }

        }
    }
}