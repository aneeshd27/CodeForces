import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int c= 1;
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
            if (i > 0 && a[i].charAt(0) == a[i-1].charAt(1))
                c++;
        }
        System.out.println(c);
    }
}