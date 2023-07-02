import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        char c[][]=new char[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                c[i][j] = sc.next().charAt(0);
            }
        }
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                
                if (c[i][j]== 'C' || c[i][j] == 'M'
                        || c[i][j] == 'Y') {
                    System.out.println("#Color");
                    System.exit(0);
                }
            }
        }
        System.out.println("#Black&White");
    }
}