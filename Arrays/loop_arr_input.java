package Arrays;

import java.util.Scanner;

public class loop_arr_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input loops
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        // output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
