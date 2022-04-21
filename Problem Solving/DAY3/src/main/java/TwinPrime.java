


// Q11.	Print twin prime number between 1 to 20

class TwinPrime {

    static void printTwinPrime(int n)
    {
        // Create a boolean array "prime[0..n]"
        // and initialize all entries it as
        // true. A value in prime[i] will
        // finally be false if i is Not a
        // prime, else true.
        boolean prime[] = new boolean[n + 1];


        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {

            // If prime[p] is not changed,
            // then it is a prime
            if (prime[p] == true) {

                // Update all multiples of p
                for (int i = p * 2; i <= n; i += p)  // i= 2*2    4+2 =6
                    prime[i] = false;
            }
        }

        // to check for twin prime numbers
        // display th twin prime
        for (int i = 2; i <= n - 2; i++) {

            if (prime[i] == true &&
                    prime[i + 2] == true)

                // Display the result
                System.out.print(" (" + i + ", " +
                        (i + 2) + ")");
        }
    }

    // Driver Program to test above function
    public static void main(String args[])
    {
        int n = 20;
        printTwinPrime(n);
    }
}
//import java.util.ArrayList;
//import java.util.Scanner;

//public class TwinPrime {
//    public void isprime(int[] arr) {
//        for (int j = 1; j <= 20; j++) {
//            int num = arr[j];
//            int m = num / 2;
//            int flag = 0;
//
//            if (num == 0 || num == 1) {
//               // System.out.println("not a prime");
//            } else {
//                for (int i = 2; i <= m; i++) {
//                    if (num % i == 0) {
//
//
//                        //  System.out.println("not a prime");
//                        flag = 1;
//                        break;
//                    }
//                }
//                if (flag == 0) {
//                    System.out.println(num + " is a prime");
//                    Integer arr1[] ={};
//                       int n=10;
////                    System.out.println("Array:"+Arrays.toString(arr1));
//
//                    ArrayList<Integer> arrayList = new  ArrayList<Integer>(n);
//                    arrayList.add(num);
//                   // arr1 = arrayList.toArray(arr1);
//                    //System.out.println(Arrays.toString(arr1));
//
//                    System.out.println(arrayList);
//                }
//            }
//
//        }
//
//    }
//
//
//
//
//    //to check twinprime
////    static boolean twinPrime(int n1,int n2){
////   //  return isprime(n1) && isprime(n2) && Math.abs(n2-n1)==2;
////    }
//
//    public static void main(String[] args)
//    {
//        TwinPrime twinPrime = new TwinPrime();
//        Scanner scanner = new Scanner(System.in);
//
//           int[] arr = { 1,2,3,4,5,6,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//           twinPrime.isprime(arr);
//
//}
//}