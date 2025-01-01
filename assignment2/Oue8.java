
import java.util.Arrays;
import java.util.Scanner;

public class Oue8 {

    Scanner s = new Scanner(System.in);

    void linearSearch(int a[]) {
        System.out.print("enter element to be searched using Linear Search: ");
        int element = s.nextInt();
        int flag = 0;
        int position = 0;
        for (int x : a) {
            position += 1;
            if (x == element) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("\nElement " + element + " is found at position: " + (position - 1));
        } else {
            System.out.println("element is not found in the array");
        }
    }

    void binarySearch(int a[]) {
        System.out.println("enter element to be searched using binary search: ");
        int element = s.nextInt();
        int flag = 0;

        int left = 0;
        int mid = 0;
        int right = a.length - 1;
        System.out.println("initially left,mid,right: " + left + " " + mid + " " + right);
        while (left <= right) {
            mid = (left + right) / 2;
            if (a[mid] == element) {
                flag = 1;
                break;
            } else if (a[mid] < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            System.out.println("left,mid,right: " + left + " " + mid + " " + right);
        }
        System.out.println("left,mid,right: " + left + " " + mid + " " + right);
        if (flag == 0) {
            System.out.println("not found");
        } else {
            System.out.println(element + " is found at position: " + mid);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 7, 8, 99, 157, 223, 25, 36, 99};
        Arrays.sort(arr);
        Oue8 a28 = new Oue8();
        a28.linearSearch(arr);
        a28.binarySearch(arr);
    }

}
