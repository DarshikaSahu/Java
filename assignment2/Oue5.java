
import java.util.Scanner;

//5 wap to define an array of integer .Take input from user .count and print numbers greater than 100 .
public class Oue5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = s.nextInt();

        int num[] = new int[n];

        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i + 1) + " :");
            num[i] = s.nextInt();
        }

        int count = 0;
        System.out.println("Number greater than 100");

        for (int i = 0; i < n; i++) {
            if (num[i] > 100) {
                System.out.println(num[i]);
                count++;
            }
            s.close();
        }
        System.out.println("Total number greater than 100 -> " + count);
    }
}
