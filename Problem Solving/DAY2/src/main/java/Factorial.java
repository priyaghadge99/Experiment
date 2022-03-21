import java.util.Scanner;

//Q2.	Accept a number from user and find a factorial of a number
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to find Factorial:== ");
        int num = scanner.nextInt();
        int fact=1;
        for(int i=1 ;i<=num;i++){

            fact = fact*i ; //if num =5 then 0*1 =0
                            //               1*0
        }
        System.out.println("Factorial of Number "+num+" is := "+fact);



    }
}
