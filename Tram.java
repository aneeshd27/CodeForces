import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        // Grab input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of stops
        int a1, a2, current, min;
        a1 = a2 = current = min = 0;
        for (int i = 0; i < n; i++) {
            a1 = sc.nextInt();
            a2 = sc.nextInt();

            current -= a1;
            current += a2;

            if (current > min) {
                min= current;
            }
        }
        System.out.println(min);
    }
}