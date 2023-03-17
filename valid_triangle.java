import java.util.Scanner;

public class valid_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side");
        double a = sc.nextDouble();
        System.out.println("Enter second side");
        double b = sc.nextDouble();
        System.out.println("Enter third side");
        double c = sc.nextDouble();

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("this is a valid Triangle");
        } else {
            System.out.println("this is not a valid triangle");
        }
    }
}
