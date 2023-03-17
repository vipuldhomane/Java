import java.util.Scanner;

import javax.sound.sampled.FloatControl;

public class simpleintrest {
    public static void main(String[] args) {

        // Write code here
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        float I = sc.nextFloat();
        int T = sc.nextInt();

        // System.out.println(P + " " + I + " " + T);
        float simpint = (P * I * T) / 100;
        int simpin = (int) simpint;
        System.out.print(simpin);

    }

}
