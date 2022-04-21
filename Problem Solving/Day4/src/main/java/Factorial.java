import java.util.Scanner;

//Factorial
public class Factorial {

    static  int factorial(int n){
        if(n==0){
            return 1;

        }else {
            return n * factorial( n-1);   //recursive function.
        }
    }
    public static void main(String[] args) {

        //logic
        //if n!=1 if n=0 o n=1
        //else  n! =n *(n-1)!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int i = scanner.nextInt();
        System.out.println( "factorial of " +i+" is "+factorial(i));


    }
}
