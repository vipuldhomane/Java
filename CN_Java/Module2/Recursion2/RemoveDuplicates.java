package Module2.Recursion2;

public class RemoveDuplicates {
    public static String removeDucplicate(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char first = s.charAt(0);
        char second = s.charAt(1);

        if (first == second) {
            return removeDucplicate(s.substring(1));

        } else {
            return first + removeDucplicate(s.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "aabbccdbbdda";
        System.out.println(removeDucplicate(str));

    }
}
