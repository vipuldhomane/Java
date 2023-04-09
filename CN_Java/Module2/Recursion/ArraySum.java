package Module2.Recursion;

public class ArraySum {
    public static int arraySum(int arr[]) {
        if (arr.length <= 0) {
            return 0;
        }
        int smallSum = arraySum(arr);

    }
}
