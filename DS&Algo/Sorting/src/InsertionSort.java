public class InsertionSort {

    public static void main(String[] args) {
        //split sorted and unsortd part of array //

        //efficient for small data set

        int arr[] = {12,11,13,5,6};
        System.out.println("Before insertion Sort");
        print(arr);
        insertionSort(arr);
        System.out.println();
        System.out.println("After insertion Sort");
        print(arr);
        System.out.println();

    }

    private static void print(int[] arr) {
        for (int i :arr){
            System.out.print(" "+i);
        }

    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];    //current element
            int j = i - 1;
                       //swap logic if j>=0  and arr[i] = 12 and arr[j] =
            while (j >= 0 && key <= arr[j])  //* Move the elements greater than key to one position ahead from their current position*/
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}

//CTr +Alt +L

/*To sort an array of size N in ascending order:

Iterate from arr[1] to arr[N] over the array.
Compare the current element (key) to its predecessor.
If the key element is smaller than its predecessor, compare it to the elements before.
Move the greater elements one position up to make space for the swapped element.*/