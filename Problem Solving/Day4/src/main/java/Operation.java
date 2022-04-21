import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Choice");
        char choice = scanner.next().charAt(0);
        System.out.println("Enter element A");
        int a = scanner.nextInt();
        System.out.println("Enter element B");
        int b = scanner.nextInt();

        switch (choice) {
            case 'a':
                int result1 = a + b;
                System.out.println(result1);
                break;
            case 'b':
                int result2 = a - b;
                System.out.println(result2);
                break;
            case 'c':
                int result3 = a / b;
                System.out.println(result3);
                break;
            case 'd':
                int result4 = a * b;
                System.out.println(result4);
                break;
            case 'e': System.exit(0);

            default:
                System.out.println("Enter valid choices");

        }
    }
}
