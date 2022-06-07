//in selection sort swap logic after finding smallest in entire array
//Best: ?(n^2)
//        Average: ?(n^2)
//        Worst: O(n^2)
//        Space Complexity
//        O(1)
public class SelectionSort {

    public static void selectionSort(int[] arr) {

        // to traverse
        for (int i = 0; i < arr.length - 1; i++) {
            //to checked whether element is small
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {  //64  > 25 then swap
                                        //25>12
                    index = j;    //search lowest index
                }
            }
            int temp = arr[index];    //swap logic
            arr[index] = arr[i];
            arr[i] = temp;


        }

    }


    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11,2, 24};   //n=5 so pass will be 4

        System.out.println("Before Sorting");
        for (int i : arr){

            System.out.print(i + " ");
        }

        System.out.println();
        selectionSort(arr);
        System.out.println("After Sorting");
        for (int i : arr){

            System.out.print(i+ " ");
        }

    }
}

