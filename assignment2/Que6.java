
import java.util.Scanner;

//6 wap to ask password from user and check if it is 123 then print  "allowed access"  else  give 3 total attempt to emter password .
//after 3 attempt print card blocked 
public class Que6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int correct_password = 123;
        int max_attempt = 3;

        System.out.println("Enter your password (You have 3 attempts):");

        for (int i = 1; i <= max_attempt; i++) {
            System.out.println("Attempt " + i + " :");
            int entered_password = s.nextInt();

            if (entered_password == correct_password) {
                System.out.println("Access Allowed.");
                return;
            } else {
                System.out.println("Incorrect password.");
            }
            s.close();
        }

        System.out.println("Your card is blocked. You entered an incorrect password 3 times.");
    }
}
