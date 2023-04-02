package JavaStrings;

public class RevWord {
    public static String reverseEachWord(String str) {
        String ans = "";
        int currentWordStart = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                // Reverse Current Word
                int currentWordEnd = i - 1;
                String reversedWord = "";
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reversedWord = str.charAt(j) + reversedWord;
                }
                // Add it final String(ans)
                ans += reversedWord + " ";
                currentWordStart = i + 1;
            }
        }
        int currentWordEnd = i - 1;
        String reversedWord = "";
        for (int j = currentWordStart; j <= currentWordEnd; j++) {
            reversedWord = str.charAt(j) + reversedWord;
        }
        ans += reversedWord;
        return ans;
    }

    public static String reverseEachWord2(String str) {
        String ans = "";
        int currentWordStart = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int currentWordEnd = i - 1;
                String revWord = "";
                // Reversing the Word
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    revWord = str.charAt(j) + revWord;
                }
                // Adding Reversed word to Original string
                ans += revWord + " ";
                currentWordStart = i + 1;
            }
        }
        String revWord = "";
        int currentWordEnd = i - 1;
        for (int j = currentWordStart; j <= currentWordEnd; j++) {
            revWord = str.charAt(j) + revWord;
        }
        // Adding Reversed word to Original string
        ans += revWord + " ";
        currentWordStart = i + 1;
        return ans;
    }

    public static void main(String[] args) {
        String str = "abc def ghi";
        System.out.println(reverseEachWord2(str));
    }
}
