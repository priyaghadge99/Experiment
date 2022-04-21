import java.util.Scanner;

//    Q8.	Accept a number from user and check if it is prime number or not
public class PrimeNum {
 public  void checkprime(int num){
     int m=0,flag=0;
     m=num/2;
     if(num==0||num==1){
         System.out.println("not a prime");
     }
     else {
         for (int i=2;i<=m;i++)
         if(num%i==0){
             System.out.println(num+" not a prime");
              flag = 1;
             break;

         }
         if(flag==0){
             System.out.println(num+" is a prime");
         }
     }



 }
    public static void main(String[] args) {
     PrimeNum primeNum = new PrimeNum();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element: ");
        int nextInt = scanner.nextInt();
        primeNum.checkprime(nextInt);
        System.out.println("======== ");


    }
}
