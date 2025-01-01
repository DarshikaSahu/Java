
import java.util.Scanner;

//3  WAP that add 10 to each element of array and print numbers that are smaller than 50.

public class Que3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[] = new int[10];

        System.out.println("Enter 10 elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Numbers after adding 10 that are smaller than 50:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 10;

            if(arr[i] < 50){
                System.out.print(arr[i] + " ");
            }
        }
        s.close();

    }
}
