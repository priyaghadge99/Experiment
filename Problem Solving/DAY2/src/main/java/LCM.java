import java.util.Scanner;
//Q16.	Accept two number from user and print it’s LCM*
public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num1 :- ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2 :- ");
        int num2 = scanner.nextInt();

        //15    5*3
        //25    5*5
        //5 * 3 *5=75 lcm


        int lcm = (num1>num2) ? num1 :num2;  //to store all numbers in lcm
        System.out.println("LCM numbers are:= "+lcm);
        while(true){
            if(lcm%num1==0 && lcm%num2==0){
                System.out.println("LCM of Number "+lcm);
                break;
            }
            lcm++;
        }
    }
}
