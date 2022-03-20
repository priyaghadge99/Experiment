import java.util.Scanner;

public class DivisibleBy {

    public void CalculateDivisibleBy(int x){
        if(x%3==0){
            System.out.println("THREE");

        }
        else if(x%7==0)
        {
            System.out.println("SEVEN");
        }
       else {
            System.out.println("Three-Seven");
        }
    }

    public static void main(String[] args) {
        DivisibleBy divisibleBy = new DivisibleBy();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int i = scanner.nextInt();

        divisibleBy.CalculateDivisibleBy(i);
    }
}
