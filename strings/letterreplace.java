package strings;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.RunElement;

public class letterreplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += input.charAt(i);
            }

        }
        System.out.println(result);
    }
}
