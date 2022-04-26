import java.util.Scanner;
//Q9.	Accept 10 number in an array accept a number to be deleted from array and print new array
public class DeleteArrayElement {


    static void delete(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = arr[i - 1];  //shift element to left side ...
            } else {
                System.out.println(arr[i] + " ");
            }
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter element to delete from array");
        int element = scanner.nextInt();
        delete(arr,element);

    }
}


//    public int[] removeAllGivenElements(int[] array, int... elements) {
//        return ArrayUtils.removeElements(array, elements);
//    }

//<dependency>
//    <groupId>org.apache.commons</groupId>
//    <artifactId>commons-lang3</artifactId>
//    <version>3.12.0</version>
//</dependency>