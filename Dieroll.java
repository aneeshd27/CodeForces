import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y=Integer.parseInt(sc.next());
        int w=Integer.parseInt(sc.next());
        int m=Math.max(y,w);
        String s[]={"0/1","1/1","5/6","2/3","1/2","1/3","1/6"};
        System.out.println(s[m]);
    }
}