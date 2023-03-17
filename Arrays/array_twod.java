package Arrays;

import java.util.Scanner;

/**
 * array_twod
 */
public class array_twod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows");
        int row = sc.nextInt();
        System.out.println("Number of Columns");
        int columns = sc.nextInt();

        int[][] numbers = new int[row][columns];

        // inputs
        // rows
        for (int i = 0; i < row; i++) {
            // columns
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        // output
        System.out.println("output");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}