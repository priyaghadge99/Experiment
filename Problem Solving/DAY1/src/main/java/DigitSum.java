import java.util.Scanner;
// What if you are asked to add the digits without using a loop. The answer is using recursion

//Recursion means a method calling itself till some condition is met
public class DigitSum
{
    public static void main(String[] args) {
//
//        DigitSum digitSum = new DigitSum();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three Digit Number :-- ");
        int num = scanner.nextInt();
        int sum = add(num);
        System.out.println("Sum of digits of " + num + " is " + sum);
        //Q11.	Accept 3 digi number from user and do the sum of its digit .(do not use any loop)

    }

        /*
        * recursive method */

       public  static int add(int num){
           //lastdigit = num%10; by using remainder
           //to get the lastDigit
           if(num==0){
               return 0;
           }
            int lastdigit= num%10;
            // call this method again with the sum of digit and remaining number
            return lastdigit + add(num/10);  //why - 345/10 =  34/10=3   3/10 = 0

        }


}
