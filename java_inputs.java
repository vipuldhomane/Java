
// // to take inputs in java we need to import
// import java.util.*;

// public class java_inputs {
//     public static void main(String[] args) {
//         Scanner myobj = new Scanner(System.in);
//         System.out.println("enter username");

//         String username = myobj.nextLine();
//         System.out.println("username is" + username);
//     }
// }

/**
 * java_inputs
 */
import java.util.*;

public class java_inputs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");

        float radius = sc.nextFloat();
        double area = (2 * radius * 3.14);
        System.out.println(area);
    }
}