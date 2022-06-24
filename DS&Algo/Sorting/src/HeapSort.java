import java.util.Arrays;

public class HeapSort {

    void heapify(int[] arr, int i, int max) {  //
        int rootlarge = i; //root
        int l = 2 * i + 1; //left
        int r = 2 * i + 2;  //right
        //left child if greater than root
        if (l < max && arr[rootlarge] < arr[l])
            rootlarge = l;
        //right if greater than root
        if (r < max && arr[rootlarge] < arr[r])
            rootlarge = r;

        //if rootlarge is not root
        if (rootlarge != i) {
            //swap
            int temp = arr[i];
            arr[i] = arr[rootlarge];
            arr[rootlarge] = temp;
            // Recursively heapify the affected sub-tree
            heapify(arr, rootlarge, max);

        }
    }

    void sort(int[] arr) {
        int n = arr.length;
        buildHeap(arr);

       /* for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }*/

        // One by one extract an element from heap
        for (int i = n - 1; i >= 1; i--) {
            //swap arr[0] with arr[i]   Move current root to end
            int swap = arr[0];
            arr[0] = arr[i];
            arr[i] = swap;
            heapify(arr, 0, i);    // call max heapify on the reduced heap

        }
    }

    //build heap  /(rearrange array)
    private void buildHeap(int[] arr) {
        int n = arr.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    public static void main(String[] args) {

        int [] arr = {12, 11, 13, 5, 6, 7};
        HeapSort heapSort = new HeapSort();

        System.out.println("Before Heap Sort :" + Arrays.toString(arr));
        heapSort.sort(arr);
        System.out.println("After Heap Sort :" + Arrays.toString(arr));

    }
}


//git rm -r --cached folder/file