package JavaStrings;

public class RevWord2 {
    public class Solution {
        static String rev(String s) {
            // l = 0;
            int n = s.length();
            String st = "";
            for (int i = 0; i < n; i++) {
                st = s.charAt(i) + st;
            }
            return st;
        }

        public static String reverseEachWord(String str) {
            // Your code goes here
            String a[] = str.split(" ");
            String s = "";
            for (int i = 0; i < a.length; i++) {
                String an = rev(a[i]);
                s += an + " ";
            }
            return s;
        }

    }
}