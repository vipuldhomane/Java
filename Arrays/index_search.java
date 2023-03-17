package Arrays;

import java.util.Scanner;

public class index_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows");
        int row = sc.nextInt();
        System.out.println("Number of Columns");
        int col = sc.nextInt();

        int[][] numMat = new int[row][col];

        // taking input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numMat[i][j] = sc.nextInt();
            }
        }
        // output
        System.out.println("output");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numMat[i][j] + " ");
            }
            System.out.println();
        }

        // Index Search
        System.out.println("Enter value to search index");
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (numMat[i][j] == x) {
                    System.out.println(x + " is found at " + (i + "," + j));
                }
            }
        }
    }
}
