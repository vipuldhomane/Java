package java_funs;

import java.util.Scanner;

public class java_funs {

    // Sum of two numbers
    public static int sumofnum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Product of two numbers
    public static int productofnum(int a, int b) {
        int sum = a * b;
        return sum;
    }

    // Factorial
    public static int factorialNum(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");

        }
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int a = sc.nextInt();

        int fact = factorialNum(a);
        System.out.println(fact);
    }
}
