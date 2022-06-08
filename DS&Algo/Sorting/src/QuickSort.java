//consider last element : pivot
//put smaller element to left of pivot
public class QuickSort {
    public static void main(String[] args) {

        int arr[] = {24,9,29,14,19,27};
        int n = arr.length;

        System.out.println("Before Sorting ");
        print(arr);
        quickSort(arr ,0,n-1);
        System.out.println();
        System.out.println("After Sorting ");
        print(arr);

    }

    private static void quickSort(int[] arr, int start, int end) {

        if (start<end){

            int p = partition(arr, start, end); //p is the partitioning index
            quickSort(arr,start ,p-1);
            quickSort(arr,p+1,end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot =arr[end];
        int i = start-1;
        for (int j=start;j<end;j++){
            // If current element is smaller than the pivot
            if (arr[j]<pivot){    //
                i++;               // increment index of smaller element
                //swap arr[i] and arr[j]
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }


        }
        int t = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = t;
        return (i + 1);

    }

    private static void print(int[] arr){

        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}



//    Quicksort is the widely used sorting algorithm that makes n log n comparisons in average case for sorting an array of n elements.
//    It is a faster and highly efficient sorting algorithm.
/*
    PARTITION (array A, start, end)
    {
        1 pivot ? A[end]
        2 i ? start-1
        3 for j ? start to end -1 {
        4 do if (A[j] < pivot) {
            5 then i ? i + 1
            6 swap A[i] with A[j]
            7  }}
        8 swap A[i+1] with A[end]
        9 return i+1
    }*/