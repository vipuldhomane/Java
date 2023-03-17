package Arrays;

import java.util.Scanner;

public class index_num_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            // System.out.println("Enter the values in array");
            numbers[i] = sc.nextInt();
        }
        // Findout varivable
        System.out.println("Enter the number to find index");
        int x = sc.nextInt();
        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println(x + " Found at the Index: " + i);
            }
        }
    }
}
