import java.util.Arrays;
import java.util.Scanner;

//Q7.	Accept 5 name from user and print their name in ascending order
public class StringAsc {
    static String[] print(String[] arr)
    {
        for (int i = 0; i < arr.length; i++)   //hold element
        {
            for (int j = i+1; j < arr.length; j++){
                if(arr[i].compareTo(arr[j])>0)
                    //compares each elements of the array to all the remaining elements
                {
                    String temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Print the String Array in Sorted manner" );
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String[] arr = {"Ani", "Sam", "Joe"};
        String[] arr = new String[5];
        System.out.println("Enter String ");
        for (int i=0;i< arr.length;i++){
            arr[i] = scanner.next();
        }
        Arrays.sort(arr);
        System.out.println("1st Result = "+Arrays.toString(arr));
        String[] result = print(arr);
        System.out.println("2nd Result  = "+ Arrays.toString(result));

    }
}
//when we have to print any array result make sure that used
//Arrays.toString(result)  follow format like this otherwise it will print hashcode format

/* Algo to sort
using
Start
        Declare an Array
        Initialize the Array
        Call the Arrays.sort() function to sort the array in alphabetical order.
        Print the sorted array.
        Stop.*/
