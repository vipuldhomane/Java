package patterns.practice;

import java.util.Scanner;

// 4
// 1 
// 2 3
// 3 4 5
// 4 5 6 7
public class pat1_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            int j = 0;
            int p = 1 + i;
            while (j < i + 1) {
                // char ch = (char) (p + 64);
                System.out.print(p + " ");
                p++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
