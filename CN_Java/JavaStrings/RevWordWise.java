package JavaStrings;

public class RevWordWise {
    public static String reverseString(String str) {
        String revString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revString += str.charAt(i);
        }
        return revString;
    }

    public static String revWordWise(String input) {
        String str = reverseString(input);
        String ans = "";
        int currentWordStart = 0;
        int i = 0;
        for (; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                // Reverse Current Word
                int currentWordEnd = i - 1;
                String reversedWord = "";
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reversedWord = input.charAt(j) + reversedWord;
                }
                // Add it final String(ans)
                ans += reversedWord + " ";
                currentWordStart = i + 1;
            }
        }
        int currentWordEnd = i - 1;
        String reversedWord = "";
        for (int j = currentWordStart; j <= currentWordEnd; j++) {
            reversedWord = input.charAt(j) + reversedWord;
        }
        ans += reversedWord;
        return ans;
    }
    // CN Solution {

    public static String reverseWordWise(String input) {
        int end = input.length();
        int i = input.length() - 1;
        String output = "";
        while (i >= 0) {
            if (input.charAt(i) == ' ') {
                output = output + input.substring(i + 1, end) + " ";
                end = i;
            }
            i--;
        }
        output += input.substring(i + 1, end);
        return output;
    }

    public static void main(String[] args) {
        String input = "Hi this is Vipul";
        reverseString(input);
        System.out.println(input);
        System.out.println(revWordWise(input));
    }

}
