import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.replace("+","");
        char a[]=s.toCharArray();
        int i;
        Arrays.sort(a);
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
            if(i==a.length-1)
            {
                continue;
            }
            System.out.print("+");
        }
    }
}