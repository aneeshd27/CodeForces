import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        String s[]=new String[n];
        int i,sum;
        sum=0;
        for(i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        for(i=0;i<n;i++)
        {
            if(s[i].equalsIgnoreCase("Tetrahedron"))
            {
                sum+=4;
            }
            else if(s[i].equalsIgnoreCase("Cube"))
            {
                sum+=6;
            }
            else if(s[i].equalsIgnoreCase("Octahedron"))
            {
                sum+=8;
            }
            else if(s[i].equalsIgnoreCase("Dodecahedron"))
            {
                sum+=12;
            }
            else if(s[i].equalsIgnoreCase("Icosahedron"))
            {
                sum+=20;
            }
        }
        System.out.println(sum);
    }
}