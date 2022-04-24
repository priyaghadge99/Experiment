import java.util.Scanner;
//Q7.	Accept 5 number in an array ( repeat numbers ) print unique array
//1. solution by using set
//2. craete array print chcek whether element present in first array then break
public class UniqueArray {


    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array element:--");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int length = arr.length;
        printUniqueArray(arr, length);


    }

    private static void printUniqueArray(int[] arr, int length) {
        System.out.println();
        System.out.println("Distinct Array");
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {       //i=0  j=0
                if (arr[i] == arr[j])
                    break;
                if (i == j)
                    System.out.print(arr[i] + "  ");

            }
        }

    }
}


// 1 2 3 4 1
//i=0 j=0
//arr[0]=1
//arr[0]=1   break
//
//i=1 j=0
//arr[1]==arr[0]
//j=1

//    static void printUniqueArray(int[] arr) {
//        HashSet hashSet = new HashSet(Arrays.asList(arr));
//        for (int i = 0; i < arr.length; i++) {
//            hashSet.add(arr[i]);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(hashSet.toString());
//        }
//    }