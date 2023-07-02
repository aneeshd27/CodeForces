import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s="";
        int i;
        char ch1,ch2;
        for(i=0;i<s1.length();i++)
        {
            ch1=s1.charAt(i);
            ch2=s2.charAt(i);
            if(ch1=='0'&& ch2=='0')
            {
                s+="0";
            }
            else if(ch1=='1'&& ch2=='1')
            {
                s+="0";
            }
            else if((ch1=='0'&& ch2=='1')||(ch1=='1'||ch2=='0'))
            {
                s+="1";
            }
        }
        System.out.println(s);
    }
}