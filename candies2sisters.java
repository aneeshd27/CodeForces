import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.next());
        while(t-->0)
        {
            double n=Double.parseDouble(sc.next());
            System.out.println((int)Math.ceil((n/2)-1));

        }
    }
}

