import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.toLowerCase();
        int i;
        String s1="";
        char ch;
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y')
            {
                continue;
            }
            s1=s1+"."+ch;
        }
        System.out.println(s1);
    }
}