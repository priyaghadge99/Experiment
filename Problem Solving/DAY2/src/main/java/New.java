import java.util.Scanner;

//Q21.	Write a program to print every integer between 1 and n divisible by m.
// also report whether the number that is divisible by m is even or odd.
public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number := ");

      
         int m=4;
        while(true){
           int  num = scanner.nextInt();
            boolean b = num % m == 0;
            num= num/m;
                if(num%2==0)
                {
                    System.out.println("Even");
                }
                else {
                    System.out.println("Odd");
                }
        }

    }
}
