import java.util.Scanner;

//Q1.	Accept 10 number user and do sum of it.(do not use array)
public class Addition {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Scanner scanner = new Scanner(System.in);
       int  sum =0;
        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter number " + count + ":-- ");
            int num = scanner.nextInt();
            sum = sum +num;

        }
        System.out.println("Sum Of Numbers :- " +sum);

    }


    //operator + cannot be applied to void thats why int method.
//    public int sumofNumbers(int num ,int count) {
//
//        int sum = 0;
//        if (num != 0) {
//            sum = num + sumofNumbers(num,count);
//
//
//        }
//
//        return sum;
//
//    }
}
