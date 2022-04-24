import java.util.Scanner;
//Q8.	Accept 10 number in an array accept a index and a new number and add that number at that index
public class AddArray {

    static void addAtIndex(int[] arr, int index) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter Index : ");
        int index = scanner.nextInt();

    }
}