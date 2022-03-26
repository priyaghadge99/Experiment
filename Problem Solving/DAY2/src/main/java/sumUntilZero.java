import java.util.Scanner;
//Q10.	Go on accepting number from user till user enter 0 and do sum of it.*
public class sumUntilZero {
    static int sum = 0;
     int num;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int num= Integer.parseInt(null);
         int num;
        System.out.println("Enter numbers");
        while ((num = scanner.nextInt()) != 0) {
        {
            sum = sum + num;

                System.out.println("SUM until ZERO IS ---" + sum);
            }


        }

    }
}



