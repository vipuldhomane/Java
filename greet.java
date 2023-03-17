
import java.util.*;;

public class greet {
    public static void main(String[] args) {

        // Write code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("The name of the person is " + name + " and the age is " + age + ".");
    }
}
