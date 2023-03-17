package conditionals.Problems;

import java.util.Scanner;

public class area_cir {
    public static double area(int r) {
        double pi = Math.PI;
        double a = (2 * pi * r);
        double area = Math.round(a * 1000.0) / 1000.0;
        return area;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();

        System.out.println(area(rad));
    }
}
