package Module2.Recursion;

public class FibonacciAtN {
    public static int fibN(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int fib_n_1 = fibN(n - 1);
        int fib_n_2 = fibN(n - 2);
        int output = fib_n_1 + fib_n_2;
        return output;
    }

    public static void fibTillN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(fibN(i) + " ");
        }

    }

    public static void main(String[] args) {
        System.out.println(fibN(50));
        // fibTillN(20);

    }
}
