package patterns;

import java.util.Scanner;

/**
 * Inverted_pyramid
 */
public class Inverted_pyramid {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in)
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // inner sapce
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}