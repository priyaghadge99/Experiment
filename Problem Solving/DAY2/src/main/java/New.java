import java.util.Scanner;

//Q21.	Write a program to print every integer between 1 and n divisible by m.
// also report whether the number that is divisible by m is even or odd.
public class New {
    private static int m = 24;

    static int num;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number Count := ");
        int n = scanner.nextInt();
        boolean b;
        for (int i = 1; i <= n; i++) {
            num = i;
          //  System.out.println("Number between 1 to "+i+ "=" +num);
            while (num % m == 0) {

                System.out.println("Number divisible by "+m+" :-  " +num);
              int diviNum = num / m;

                if (num % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
                break;
            }

        }
    }
}
