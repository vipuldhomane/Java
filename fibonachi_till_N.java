import java.util.Scanner;

public class fibonachi_till_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a, b;
        a = 0;
        b = 1;

        while (a < N) {

            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
            // if (a == N) {
            // break;
            // }
        }
    }
}
