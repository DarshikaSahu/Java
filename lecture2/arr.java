// wap to ask 5 no from user in arr and display them

// import java.util.Scanner

// public class arr {
    
// }




// wap to ask 7 no from user and store them in array and print sum of them

import java.util.Scanner;

public  class arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int k = 7;
        int sum = 0;
        int arr[] = new int[k];

        for(int i=0; i<arr.length; i++){
            System.out.println("Enter number:");
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
