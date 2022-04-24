import java.util.Scanner;
//selection sort
// we search for the lowest element and arrange it to the proper location.
// We swap the current element with the next lowest number.
public class SelectionSort {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new  int[6];
        int n = arr.length;
        System.out.println("Enter array element");
        for(int i=0;i<n;i++){
         arr[i] = scanner.nextInt();
    }
        System.out.println("Before Sorting:---");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        selectionSort(arr);
        System.out.println("After Sorting:---");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }

}

    private static void selectionSort(int[] arr) {
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[i]){
                   int temp = arr[j];
                   arr[i] = arr[j];
                   arr[i]= temp;

               }

           }
       }
    }
    }


/* i=0
5 -3 1 6 4 7
i=1
5 -3 1 6 4 7
 i=2
 5 -3
*/