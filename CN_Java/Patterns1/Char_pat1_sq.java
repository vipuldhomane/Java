package Patterns1;
// A B C D 

// A B C D
// A B C D
// A B C D

import java.util.*;

public class Char_pat1_sq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                char jthcar = (char) ('A' + j - 1);
                System.out.print(jthcar + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
