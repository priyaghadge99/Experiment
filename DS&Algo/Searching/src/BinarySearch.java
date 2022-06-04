import static java.util.Arrays.binarySearch;

public class BinarySearch {


    public static void main(String[] args) {
        int arr[]= { 2,5,8,12,16,23,38,52,72,91};
        int key =23;
        System.out.println("Array length " +arr.length);
        int low = 0 ,high = arr.length-1;


        int search = binarySearch(low, high, key, arr);

        if (search==-1){
            System.out.println("key not present");
        }
        else {
            System.out.println("Key lies in " + search +" index ");
        }
    }

    private static int binarySearch(int low, int high, int key, int[] arr) {
        int mid = low+(high-1)/2;  //mid=4
        int index;
        if (low<high){


            if (key==arr[mid]){
                return mid ;
            }
            else if (key>arr[mid]){    //key greater than mid means its in right half
                return mid+1;

            }
            else {      //else keu in left half
               return mid-1;
            }

        }
        else {
            System.out.println("Enter Correct choice");
            return -1;
        }


    }
}
