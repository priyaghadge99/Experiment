public class CountingSort {
    public static void main(String[] args) {
        int arr[] ={ 1,0,3,1,3,1};

        countingSort(arr);

    }

    private static void countingSort(int[] arr) {
      int outputArr[]= new int[arr.length];


        int[] countArr = new int[arr.length];
      for (int i=0;i< arr.length;i++){
         
          countArr[i] = 0;

      }
      //First store zero
        for (int j:countArr){
            System.out.print(j +" ");
        }
        //count each element in array
      for (int i=0;i<arr.length;i++){
          ++countArr[arr[i]];

      }

        for (int j:countArr){
            System.out.print(j +" ");
        }
    }
}
