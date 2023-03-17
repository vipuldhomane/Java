package conditionals.Problems;

import java.util.Scanner;

public class greater_num {
    public static int greatNum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(greatNum(a, b));
    }
}
