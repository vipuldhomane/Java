package patterns;

import java.util.Scanner;

public class butterfly {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // breakdown
        for (int i = 1; i < n; i++) {
            // increasing *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // decreasing sp
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            // decreasing sp
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            // increasing *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // down part
        for (int i = 1; i <= n; i++) {
            // decreasing *
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            // increasing sp
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            // increasing sp
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            // decreasing *
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // break
        // decreasing *
        // increasing sp
        // increasing sp
        // decreasing *
    }
}
