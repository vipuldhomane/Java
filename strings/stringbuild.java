package strings;

import java.util.Scanner;

public class stringbuild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("Tony");
        System.out.println(str.charAt(0));
        str.setCharAt(0, 'P');
        System.out.println(str);
        str.append("Stark");
        System.out.println(str);
        str.setCharAt(0, 'T');
        System.out.println(str);
        str.insert(0, 'S');
        System.out.println(str);
        str.delete(5, 45);
        System.out.println(str);

        str.  

    }
}
