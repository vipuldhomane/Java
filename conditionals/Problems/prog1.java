package conditionals.Problems;

import java.util.Scanner;

public class prog1 {
    public static void main(String[] args) {
        int positive = 0, negative = 0, zeros = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to continue press 0 to exit");
        int input = sc.nextInt();

        while (input == 1) {
            System.out.println("enter value");
            int inp = sc.nextInt();
            if (inp > 0) {
                positive = positive + 1;
            } else if (inp < 0) {
                negative = negative + 1;
            } else {
                zeros = zeros + 1;
            }
            System.out.println("Press 1 to continue & 0 to stop");
            input = sc.nextInt();

            System.out.println("Positives : " + positive);
            System.out.println("Negatives : " + negative);
            System.out.println("Zeros : " + zeros);

        }
    }
}
