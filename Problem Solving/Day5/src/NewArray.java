import java.util.Scanner;
//Q5.	Accept two set of array each having 5 element sort it and put it in new array
public class NewArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = n1 + n2;
        int mergeArray[] = new int[n3];

        System.out.println("Enter 1st array element");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter 2d array element");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = scanner.nextInt();
        }

        for (int i = 0; i < n1; i++) {
            mergeArray[i] = arr1[i];
        }
        for (int i = n1, j = 0; i < n3; i++, j++) {
            mergeArray[i] = arr2[j];
        }
        System.out.println("Merge array");
        for (int j = 0; j < mergeArray.length; j++) {
            System.out.print(mergeArray[j] + " ");
        }
        sortArray2(mergeArray);
        System.out.println();
        System.out.println("After Sorting:===");
        for (int j = 0; j < mergeArray.length; j++) {
            System.out.print(mergeArray[j] + " ");
        }
    }
    private static void sortArray2(int[] mergeArr) {
        for (int i = 0; i < mergeArr.length; i++) {
            for (int j = i + 1; j < mergeArr.length; j++) {
                if (mergeArr[i] > mergeArr[j]) {
                    int temp = mergeArr[i];
                    mergeArr[i] = mergeArr[j];
                    mergeArr[j] = temp;
                }
            }
        }
    }
}