import java.util.Scanner;

public class OddOrEven {
    public void checkOddOrEven(int x){
        if(x%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

     return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OddOrEven oddOrEven = new OddOrEven();
        System.out.println("Enter number :-");
        int i = scanner.nextInt();
        oddOrEven.checkOddOrEven(i);
        
    }
}
