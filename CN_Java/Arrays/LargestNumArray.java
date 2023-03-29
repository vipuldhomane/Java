package Arrays;

import java.util.Scanner;

public class LargestNumArray {
    public static int[] takeinput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter value for " + i + "th element: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static int maxNumArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int array[] = takeinput();
        int max = maxNumArray(array);
        System.out.println(max);
    }
}
