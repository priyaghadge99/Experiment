import java.util.Scanner;
//Q3.	Accept 10 number from user count how many are  positive ,negative , zero
public class PositiveCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number := ");
        int countN = 0,countP = 0,countZ = 0;
       
        for (int i = 1; i <= 10; i++) {
            double num = scanner.nextInt();
            if (num == 0) {
                countZ++;
            } else if (num < 0) {
                countN++;
            } else {
                countP++;
            }
        }

        System.out.println("number of  negative count:-- " +countN);
        System.out.println("number of  Positive count:-- "+countP);
        System.out.println("number of  zero count:-- "+countZ);
    }
}