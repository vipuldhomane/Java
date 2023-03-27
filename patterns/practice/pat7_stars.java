package patterns.practice;
// 4

//    *
//   **
//  ***
// ****

import java.util.Scanner;

public class pat7_stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            int star = 1;
            while (star <= i) {
                System.out.print("*");
                star++;
            }
            System.err.println();
            i++;
        }
    }
}
