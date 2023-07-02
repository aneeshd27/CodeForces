import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x1=Integer.parseInt(sc.next());
        int x2=Integer.parseInt(sc.next());
        int x3=Integer.parseInt(sc.next());
        int a[]={x1,x2,x3};
        Arrays.sort(a);
        int sum=0;
        int i;
        for(i=1;i<a.length;i++)
        {
            sum+=(a[i]-a[i-1]);
        }
        System.out.println(sum);
    }
}