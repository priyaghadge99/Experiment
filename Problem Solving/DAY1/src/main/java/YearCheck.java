import java.util.Scanner;

public class YearCheck {


    public int leapYearORNot(int i) {
        if(i%4==0){
            System.out.println("Leap year : "+i);
           return i;
        }
        else
            System.out.println("Not Leap year : "+i);
            return i;

    }
}
class Main3{
    public static void main(String[] args) {

        YearCheck yearCheck = new YearCheck();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year -:");
        int i = scanner.nextInt();
        yearCheck.leapYearORNot(i);
    }
}