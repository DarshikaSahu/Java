
import java.util.Scanner;

// 7  Take 20 integer inputs from user and print the following:number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0s.
public class Que7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num[] = new int[20];

        System.out.println("Enter 20 integer list: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Integer " + (i + 1) + " :");
            num[i] = s.nextInt();
        }

        System.out.println("Results: ");
        for (int i = 0; i < num.length; i++) {

            if (num[i] > 0) {
                System.out.println(num[i] + " is positive integers.");
            } else if (num[i] < 0) {
                System.out.println(num[i] + " is negative integers.");
            } else {
                System.out.println(num[i] + " is zeroes.");
            }

            if (num[i] % 2 == 0) {
                System.out.println(num[i] + " is even integers.");
            } else {
                System.out.println(num[i] + " is odd integers.");
            }

            s.close();
        }
    }
}
