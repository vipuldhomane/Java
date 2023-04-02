package Arrays.Algo;

public class Sort012 {

    public static void sort012(int[] arr) {

        int nextZero = 0;
        int nextTwo = arr.length - 1;
        int i = 0;

        while (i <= nextTwo) {

            if (arr[i] == 0) {

                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                i++;
                nextZero++;

            } else if (arr[i] == 2) {

                int temp = arr[nextTwo];
                arr[nextTwo] = arr[i];
                arr[i] = temp;
                nextTwo--;

            } else {
                i++;
            }
        }
    }

    public static void readarray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 0, 2, 0, 1, 0, 2, 1, 0, 2, 1, 0, 2, 1, 0, 2 };
        sort012(array);
        readarray(array);
    }
}