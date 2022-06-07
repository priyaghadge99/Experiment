public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,1,4,2,8};   //legth=5
        int length = arr.length;
        System.out.println("Before bubble Sort");

        for (int i :arr){
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i=0;i<length-1;i++ ){

            for (int j=i+1;j<length;j++){
                if (arr[j]<arr[i]){
                   int temp = arr[j];  //swap logic  if 5>1
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        System.out.println("after Bubble Sort");
        for (int i:arr){
            System.out.print(i+" ");
        }

    }
}
