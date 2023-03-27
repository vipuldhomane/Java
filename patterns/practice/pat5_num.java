package patterns.practice;

import java.util.*;

// 4
// A
// BB
// CCC
// DDDD
public class pat5_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // using while loops
        int i = 0;

        while (i < n) {
            int j = 0;
            while (j < i + 1) {
                int p = i + 1;
                char ch = (char) (p + 64);
                System.out.print(ch);
                j++;
                // p++;
            }
            System.out.println();
            i++;
        }
    }
}
