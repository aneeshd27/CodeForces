import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.toLowerCase();
        System.out.println(Character.toUpperCase(s.charAt(0))+s.substring(1));
    }
}