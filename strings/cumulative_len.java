package strings;

import java.util.Scanner;

public class cumulative_len {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totallength = 0;

        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
            totallength += array[i].length();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ' ');
        }
        System.out.println(totallength);
    }
}
