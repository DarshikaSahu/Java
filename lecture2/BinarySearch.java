

public class BinarySearch {
    public static void main(String[] args) {
        
        int arr[] = {2,4,6,8,10,12,14,18,20};
        int flag = 0;
        int no = 17;
        int left = 0;
        int right = arr.length-1;
        int mid = 0;

        //builtin--> give -ve value if number not found
        //System.out.println(Arrays.binarySearch(arr, no));

        // int pos = Arrays.binarySearch(arr, no);
        // if(pos < 0){
        //     System.out.println("not Found");
        // }else{
        //     System.out.println("found");
        // }


        while(left <= right){
            mid = (left + right)/2;

            if(arr[mid] == no){
                flag = 1;
                break;
            }
            else if(arr[mid] < no){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        
        if(flag == 1){
            System.out.println("Number Found");
        }else{
            System.out.println("Not found");
        }


    }
}
