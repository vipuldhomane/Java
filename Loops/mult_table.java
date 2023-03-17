package Loops.for_loops;

import java.util.Scanner;

public class mult_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get the Multiplication Table:");
        int n = sc.nextInt();
        int i = 1;
        while (i < 11) {
            System.out.println(n * i);
            i++;

        }
    }
}
