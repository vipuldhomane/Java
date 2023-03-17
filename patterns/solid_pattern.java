package patterns;

import java.util.Scanner;

public class solid_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        // int n = 2;
        // int m = 2;

        // outer loop
        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
