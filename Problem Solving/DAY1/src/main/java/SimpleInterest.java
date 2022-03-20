import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
//        Q12.	Accept years of investment rate of interest and
//        principal amount of investment find simple interest

        //(p*R*T) /100
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Investment Rate ---:");
        int rate = scanner.nextInt();
        System.out.println("How many Years");
        int year =scanner.nextInt();
        System.out.println("Enter Principal Amount:---");
        int principal = scanner.nextInt();
        SimpleInterest simpleInterest = new SimpleInterest();
        simpleInterest.calculateSimpleInterest(principal,rate,year);



    }

    private double calculateSimpleInterest(int p , int r , int t){
        double interest = (p * r *t)/100;
        System.out.println("Simple Interest:--"+interest);
        return interest;
        }


}
