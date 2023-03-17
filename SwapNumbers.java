import java.util.Scanner;

/**
 * SwapNumbers
 */
public class SwapNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, temp;

        System.out.println("enter values");
        x = sc.nextInt();
        y = sc.nextInt();

        temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y);
    }
}