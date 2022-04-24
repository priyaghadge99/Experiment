import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        int n= arr.length;
        System.out.println("Enter array Element");
        for (int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("before Sorting");
        printArray(arr);
        insertionSort(arr);
        System.out.println();
        System.out.println("After Sorting");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i=0 ;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    private static void insertionSort(int[] arr) {
        int n= arr.length;
        for(int i=0;i<n;i++){
            int key = arr[i];
            int j=i-1;
       while ( j>-1 && arr[j]>key){
            arr[j+1] = arr[j];
            j--;
        }
       arr[j+1] = key;

        }
    }

}


//Algorithm
//To sort an array of size n in ascending order:
//1: Iterate from arr[1] to arr[n] over the array.
//2: Compare the current element (key) to its predecessor.
//3: If the key element is smaller than its predecessor, compare it to the elements before.
// Move the greater elements one position up to make space for the swapped element.