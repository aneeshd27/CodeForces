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
            int i,pos;
            pos=0;
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(sc.next());
            }
           int j,c;
            c=0;
            for(i=0;i<n;i++)
            {   c=0;
                for(j=0;j<n;j++)
                {

                    if(a[i]==a[j])
                    {
                        c++;
                    }
                }
                if(c==1)
                {
                    pos=i;
                    break;
                }
            }

            System.out.println(pos+1);
        }
    }
}