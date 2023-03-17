package Arrays;

public class array_java {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 98;

        // to print values
        System.out.println(marks[1]);
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
        // Another way of creating an array;
        int subMarks[] = { 67, 89, 97, 87, 85 };

        // printing the subMarks
        for (int i = 0; i < subMarks.length; i++) {
            System.out.println(subMarks[i]);
        }

        //
    }
}
