import java.util.Scanner;
//Q4.	Accept   a number from user  and do sum of digit
public class Digisum {
    static int sum =0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count");

        int count = scanner.nextInt();

        System.out.println("Enter the number");
        for(int i=1;i<=count;i++) {
            int num = scanner.nextInt();
            sum = sum + num; //0 +6  // 6+9 //15

        }
        System.out.println("Enter the sum :--"+sum);
    }
}
