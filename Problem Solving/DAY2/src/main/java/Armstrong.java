import java.util.Scanner;
//Q9.	Accept a number from user and check if it is armstrong number or not
//a.	Eg 153
//b.	1 cube
//c.	5 cube
//d.	3 cube   sum of it (1+27+125=153)
public class Armstrong {
    static int  cube  = 0;
    static int  sum =0;
    public static int findArmStrongsum(int num) {
        while (num != 0) {
            int lastdigit = num % 10;
            cube = (lastdigit) * lastdigit * lastdigit;
            sum = sum + cube; //sum+=cube
            num = num / 10; //num/=10
            cube = 0;
        }
        return sum;
    }
    public static void findArmStrong(int number){


        if(sum==number)
        {
            System.out.println(" "+number+"ARMSTRONG");
        }
        else {
            System.out.println("NOT ARMSTRONG");
        }
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Armstrong armstrong = new Armstrong();
        System.out.println("Enter num:---");
        int num = scanner.nextInt();

        armstrong.findArmStrongsum(num);
        armstrong.findArmStrong(num);

    }
}
