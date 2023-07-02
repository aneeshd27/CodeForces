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
            int i,c1,c2,c3,c4,c5;
            c1=c2=c3=c4=c5=0;

            char ch;
            for(i=0;i<n;i++)
            {
                ch=s.charAt(i);
                if(ch=='m')
                {
                    c1++;
                }
                else if(ch=='i')
                {
                    c2++;
                }
                else if(ch=='u')
                {
                    c3++;
                }
                else if(ch=='r')
                {
                    c4++;
                }
                else if(ch=='T')
                {
                    c5++;
                }
            }
            if(c1==1 && c2==1 && c3==1 && c4==1 && c5==1&&(c1+c2+c3+c4+c5==s.length()))
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