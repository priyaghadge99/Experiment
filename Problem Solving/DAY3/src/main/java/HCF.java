import java.util.Scanner;

//Q9.	Accept  two number from user and find HCF
public class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num1 :- ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2 :- ");
        int num2 = scanner.nextInt();

        //15    5*3
        //25    5*5
        // ans 5 = HCF

        int hcf = (num1>num2) ?num1 :num2;
        for (int i =1;i<=num1||i<=num2;i++){
           if(num1%i==0 && num2%i==0)
            hcf=i;

        }
        System.out.println("HCF of Two number :-----"+hcf);
    }
}
