public class CountingSort {


    private static void countingSort(int[] arr) {   // different main
      int outputArr[]= new int[arr.length];

      int n= arr.length;
        int[] output = new int[0];
        int[] countArr = new int[arr.length];
      for (int i=0;i< arr.length;i++){
         
          countArr[i] = 0;

      }
      //First store zero
        for (int j:countArr){
//            System.out.print(j +" ");
        }
        //count each element in array
      for (int i=0;i<arr.length;i++){
          ++countArr[arr[i]];

      }

        for (int j:countArr){
            System.out.print(j +" ");
        }


        //change position of count[i]
        for(int i=1;i<=arr.length-1;++i){
            countArr[i] += countArr[i-1];
        }
        // Build the output character array
        // To make it stable we are operating in reverse order.

        for (int i = n - 1; i >= 0; i--) {
          
            output[countArr[arr[i]] - 1] = arr[i];
            --countArr[arr[i]];
        }


        for (int i = 0; i < n; ++i){
            arr[i] = output[i];
    }


  }

    public static void main(String[] args) {
        int arr[] ={ 1,0,3,1,3,1};

        countingSort(arr);
        System.out.print("Sorted character array is ");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i]);
    }


}

