package Arrays;

public class arraySum {
    // Sum of an Array:
    public static int sumArray(int arr[]) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }
}
