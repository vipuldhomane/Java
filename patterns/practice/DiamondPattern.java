package patterns.practice;

// Here is the Java code for the diamond pattern for N=5:
import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n / 2;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i <= n / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
        }
    }
}