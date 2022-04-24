import java.util.Scanner;

public class ArrayProgram {
    //    Q6.	Accept 5 number in an array,
//    accept a number from user and check if given number is there in an array or not use binary search
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter array element:-- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter number:--");
        int num = scanner.nextInt();

        int result = BinarySearch(arr, num);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element " + num + " present in array");
        }

    }

    private static int BinarySearch(int[] arr, int num) {
        int l = 0, r = arr.length - 1, mid;
        mid = (l + r) / 2;
        while (l <= r) {
           mid = l + (r - l) / 2;   //this is logic;
                if (num == arr[mid]) {
                    return mid;
                } else if (num > arr[mid]) {
                    l = mid + 1;

                } else {
                    r = mid - 1;


                }

            }


        return -1;
    }


    }



//Step-by-step Binary Search Algorithm: We basically ignore half of the elements just after one comparison.
//
//Compare x with the middle element.
//If x matches with the middle element, we return the mid index.
//Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.
//Else (x is smaller) recur for the left half.