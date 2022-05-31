
//Input : arr[] = {10, 20, 80, 30, 60, 50,
//                     110, 100, 130, 170}
//          x = 110;
//Output : 6
public class LinearSearch {




    public static void main(String[] args) {

        int arr[] = {
                10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
       int x= 110;
        search(arr,x);



    }

    private static int search(int[] arr, int x){

        for (int i=0;i<=arr.length; i++){
            if (arr[i]==x){
                return i;
            }


        }

      return -1;
}
