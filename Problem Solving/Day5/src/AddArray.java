import java.util.Scanner;

//Q8.	Accept 10 number in an array accept a index and a new number and add that number at that index
public class AddArray {

    static void addAtIndex(int[] arr, int index, int element) {
        int i;
        int newarr[] = new int[arr.length + 1];
        if (index < arr.length) {
            for (i = 0; i < newarr.length; i++) {

                if (i < index - 1) {   //upto position -1 copy element
                    newarr[i] = arr[i];
                } else if (i == index - 1) {
                    arr[index] = element;
                } else {

                    try {
                        newarr[i] = arr[i - 1];
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("please enter index greater than zero" + e.getMessage());

                    }

                }
                System.out.println(newarr[i] + " ");
            }

        } else {
            System.out.println("Enter valid index: ");
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Enter numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter Index : ");
        int index = scanner.nextInt();
        System.out.println("Enter Element : ");
        int element = scanner.nextInt();

        addAtIndex(arr, index, element);


    }
}



  /*  Get the element value which needs to be inserted.
        Get the position value.
        Check whether the position value is valid or not.
        If it is valid, Shift all the elements from the last index to position index by 1 position to the right.
        insert the new element in arr[position]
        Otherwise */