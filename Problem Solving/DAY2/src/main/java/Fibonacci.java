import java.util.Scanner;

//Q15.	Accept term from user and print Fibonacci series*
//using recursion

public class Fibonacci {
    static int n1 = 0, n2 = 1;

     static int printFabonacci(int numcount) {
       if(numcount>0){
            int n3 = n1 + n2;


             n1=n2;
             n2=n3;//0+1 = 1   //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

            //1+1=2
           System.out.println( n3+",");
            printFabonacci(numcount-1);
        }
        return numcount;

    }
        public static void main (String[]args)
        {
            Fibonacci fibonacci = new Fibonacci();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter numCount:= ");
            int numCount = scanner.nextInt();
            System.out.print(n1+","+n2 +",");  //0 & 1
            fibonacci.printFabonacci(numCount - 2);  //n-2 because 2 numbers are already printed



        }
    }
