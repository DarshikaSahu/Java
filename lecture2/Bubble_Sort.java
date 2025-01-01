// wap to store 7 no. in array and print them in sorted order
//import java.util.Arrays;


public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = {22,33,2,77,1,88,13};

        // sorted by using builtin func
        // Arrays.sort(arr);    

        // for(int x:arr){
        //     System.out.println(" "+ x);
        // }

        for(int j = 0; j < arr.length; j++){
            for(int i = 0; i < arr.length-j-1; i++){

                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for(int x : arr){
            System.out.print(" "+ x);
        }
    }
}
