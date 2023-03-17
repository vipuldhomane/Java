package conditionals.Problems;

import java.util.Scanner;

public class vote_eligible {
    public static boolean eligiblity(int age) {
        if (age >= 18) {
            return true;
            // System.out.println("Not Eligible to vote");
        } else {
            return false;
            // System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(eligiblity(age));
    }
}
