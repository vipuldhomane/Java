package patterns.practice;

import java.util.Scanner;

public class pat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int sp = 1;
            while (sp <= (n - i + 1)) {
                System.out.print(" ");
                sp++;
            }
            int p = i;
            int num = 1;
            while (num <= i) {
                System.out.print(p);
                num++;
                p++;
            }
            int dec = i - 1;
            int dec_p = 2 * dec;
            while (dec >= 1) {
                System.out.print(dec_p);
                dec--;
                dec_p--;
            }
            System.out.println();
            i++;

        }
    }
}
