//Q1.	Accept 5 number in an array, accept a number from user
// and check if given number is there in an array or not
import java.util.Scanner;

public class ArrayCheck {
   static boolean checknum(int[] arr, int num){
       int a=0;
       for( int x : arr) {
         //  System.out.println(x);
           if (num == arr[x]) {  //arrayoutofbound exception if element not prsent
               return true;
           }
           else
               return false;
       }
       return false;
   }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check in array :");
        int num = scanner.nextInt();
        int [] arr = new int[5];

        System.out.println("Enter Array numbers :==");
        for(int a=0;a<arr.length;a++){
            arr[a] = scanner.nextInt();
         }
       checknum(arr,num);
       System.out.println("the element "+ num + " present in array "+arr.toString() );

    }
    }

    // arr[a] to check
 /*
    for(num : arr[a]){
 *   if(num==arr[a])
 *    return true;
 *
 * }
 * */