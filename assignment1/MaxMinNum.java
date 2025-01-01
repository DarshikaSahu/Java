public class MaxMinNum {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for(int num : arr){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {7,2,10,4,6};
        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}
