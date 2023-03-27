package patterns.practice;

import java.util.Scanner;

/**
 * pat12
 */
public class pat12 {
    public static void main(String[] args) {
        int a = 10;
        a += ++a - 5 / 3 + 6 * a;
        System.out.print(a);
    }
}