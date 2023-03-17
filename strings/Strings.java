package strings;

import java.net.SocketTimeoutException;

import javax.naming.ldap.ManageReferralControl;

public class Strings {
    public static void main(String[] args) {

        String fname = "vipul";
        String fname1 = "vipul";
        String fname2 = "Vipul";
        String lname = "dhomane";
        String fullName = fname + lname;
        System.out.println(fullName);
        System.out.println(fullName.length());
        // System.out.println(fullName.charAt(6));

        // looping to print all the values
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // comparing two strings
        if (fname.equals(fname1)) {
            System.out.println("same");
        } else {
            System.out.println("Not same");
        }
        if (compareTo(fname, fname2)) {
            System.out.println("same");
        } else {
            System.out.println("Not same");
        }
    }
}
