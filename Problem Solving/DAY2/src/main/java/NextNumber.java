import java.util.Scanner;
//Q11.	Accept a number from user and print next 5 numbers.
public class NextNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num");
        int num = scanner.nextInt();
        for (int i = 1; i <=5; i++) {
            System.out.println("Printing   " + num);

            num += 1;
        }
    }
}
