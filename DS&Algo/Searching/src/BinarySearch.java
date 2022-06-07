import static java.util.Arrays.binarySearch;

public class BinarySearch {


    public static void main(String[] args) {
        int arr[]= { 2,5,8,12,16,23,38,52,72,91};
        int key =52;
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
       //mid=4
        int index;
        while(low<=high){

            int mid = low+(high-low)/2;  //main logic is here //

            if (key==arr[mid])
                return mid ;

//            If key greater, ignore left half
             if (key>arr[mid])
                //key greater than mid means its in right half
                low=mid+1;

             //If key smaller, ignore right half
             else       //else keu in left half
              high= mid-1;



        }
//        else {
//            System.out.println("Enter Correct choice");
//            return -1;
//        }


        return -1;
    }
}


/*But if we calculate the middle index like this(int mid = (low + high)/2;) means our code is not 100% correct, it contains bugs.

        That is, it fails for larger values of int variables low and high. Specifically, it fails if the sum of low and high is greater than the maximum positive int value(231 – 1 ).

        The sum overflows to a negative value and the value stays negative when divided by 2.
        In java, it throws ArrayIndexOutOfBoundException. */