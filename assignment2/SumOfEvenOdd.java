// 1 wap to take 10 numbers in an array and print count of even and odd number in given array.

public class SumOfEvenOdd {

    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int evenNum = 0;
    int oddNum = 0;

    void count_even() {
        for (int x : arr) {
            if (x % 2 == 0) {
                evenNum += 1;
            }
        }
        System.out.println("Count of Even Numbers: " + evenNum);
    }

    void count_odd() {
        for (int x : arr) {
            if (x % 2 != 0) {
                oddNum += 1;
            }
        }
        System.out.println("Count of Even Numbers: " + oddNum);

    }

    public static void main(String[] args) {
        SumOfEvenOdd a12 = new SumOfEvenOdd();
        a12.count_even();
        a12.count_odd();
    }

}
