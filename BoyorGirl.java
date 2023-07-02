import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i,c;
        c=1;
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        for(i=1;i<ch.length;i++)
        {
            if(ch[i]!=ch[i-1])
            {
                c++;
            }
        }
        if(c%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
        {
            System.out.println("IGNORE HIM!");
        }
    }
}