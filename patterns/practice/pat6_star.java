package patterns.practice;

import java.util.Scanner;

public class pat6_star {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int p = i + 1;
            // char ch = (char) (p + 64);
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print("* ");
                j++;
                // p++;
            }
            System.out.println();
            i++;
        }
    }

}