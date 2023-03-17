package strings;

import java.lang.ProcessBuilder.Redirect.Type;

public class int_parsing {
    public static void main(String[] args) {
        String num = "123456";
        int number = Integer.parseInt(num);
        System.out.println(number);

        String strnum = Integer.toString(number);
        System.out.println(strnum);
    }
}
