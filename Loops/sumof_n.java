package Loops.for_loops;

import java.util.Scanner;

/**
 * sumof_n
 */
public class sumof_n {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to Find sum: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The Sum is " + sum);
    }
}