package patterns.practice;

import java.util.*;
// 4
// 1
// 22
// 333
// 4444

public class pat4_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // using while loops
        int i = 0;

        while (i < n) {
            int p = i + 1;
            int j = 0;
            while (j < i + 1) {
                System.out.print(p);
                j++;
                // p++;
            }
            System.out.println();
            i++;
        }
    }
}
