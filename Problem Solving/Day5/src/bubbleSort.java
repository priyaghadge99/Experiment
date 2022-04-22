import java.util.Scanner;
//logic bubble sort
//array is traversed from first element to last element. Here,
// current element is compared with the next element.
// If current element is greater than the next element, it is swapped.
public class bubbleSort {
    static  void bubbleSort(int[] arr ){
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++)
            {
                if(arr[j]<arr[j-1]){   //swap element if cuurent(arr[j-1]) > next
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element:--");
        for (int a = 0; a < array.length; a++) {
            array[a] = scanner.nextInt();

        }
        System.out.print("before sorting :- ");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        bubbleSort(array);
        System.out.println();
        System.out.print("after sorting :- " );
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
/* i=0;
 2 4 5 1 12
 i=1
 2 4 1 5 12
 i=2
 2 1 4 5 12
 i=3
 1 2 4 5 12
 i=4
 1 2 4 5 12

 */
