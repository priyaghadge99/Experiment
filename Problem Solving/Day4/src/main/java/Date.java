import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

//Q3.	Accept date month and year from user and print date in formatedd-mmm-yyyy
//a.	Eg. Input 12/3/2012  o/p 12 january 2012
public class Date {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

         System.out.println("Enter Date");
        String date = scanner.next();
        java.util.Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse( date);

        System.out.printf("%2$td %1$s %2$tB  %2$tY" ,"",date1);


    }
}
