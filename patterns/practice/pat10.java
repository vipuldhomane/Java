package patterns.practice;
// 4

//     *
//    ***
//   *****
//  *******

import java.util.Scanner;

public class pat10 {
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
            int star = 1;
            while (star <= i) {
                System.out.print("*");
                star++;
            }
            int dec = i - 1;
            while (dec >= 1) {
                System.out.print(dec);
                dec--;
            }
            System.out.println();
            i++;
        }
    }
}
