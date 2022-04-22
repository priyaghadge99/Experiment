import java.util.Scanner;

//     Q5.	Accept a number from user and do sum of digit
public class Number {
    static int sum(int i) {
        int c = 0, result = 0;
        if (i == 0) {

            return 0;
        }
        int lastnum = i % 10;
        return lastnum + sum(i / 10);    //recursive call to method sum
    }

    public static void main(String[] args) {
        Number number = new Number();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1");
        int i = scanner.nextInt();
        int sum= sum(i);
        System.out.println("Sum of digits of " + i + " is " + sum);
        System.out.println();

    }
}


//logic
//23223  = count = 5
// lastnum = num%10    3       2         2           3            2
// result+=lastnum      3      2+3 =5    5+2=7       7+3=10       12
//sum(i/10)            i=2322    232      23          2           0