
import java.util.Scanner;

//2 WAP to define two array a and b of size 5  .Add both array elements and store them to third array 

public class Array {
    public static void main(String[] args) {
        Scanner s2 = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];

        System.out.println("Enter 5 numbers of array a: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s2.nextInt();
        }

        System.out.println("Enter 5 numbers of array b: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = s2.nextInt();
        }

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("The resulting array after addition is:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        
        s2.close();
    }
}
