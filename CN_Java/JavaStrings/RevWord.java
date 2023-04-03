package JavaStrings;

public class RevWord {
    public static String reverseEachWord(String input) {
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

    public static String reverseEachWord2(String input) {
        String ans = "";
        int currentWordStart = 0;
        int i = 0;
        for (; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                int currentWordEnd = i - 1;
                String revWord = "";
                // Reversing the Word
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    revWord = input.charAt(j) + revWord;
                }
                // Adding Reversed word to Original string
                ans += revWord + " ";
                currentWordStart = i + 1;
            }
        }
        String revWord = "";
        int currentWordEnd = i - 1;
        for (int j = currentWordStart; j <= currentWordEnd; j++) {
            revWord = input.charAt(j) + revWord;
        }
        // Adding Reversed word to Original string
        ans += revWord + " ";
        currentWordStart = i + 1;
        return ans;
    }

    public static void main(String[] args) {
        String input = "abc def ghi";
        System.out.println(reverseEachWord(input));
    }
}
