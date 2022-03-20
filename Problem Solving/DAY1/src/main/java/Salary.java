import java.util.Scanner;
//Q10.	Enter sex m/f  and salary-
// if m-salary>8000 tax is 5% of salary
// else 2%
// if f-salary>5000 tax is 3% else tax is 1%
// find a net salary=salary-tax

public class Salary {

    static double tax = 0;
    private static int choice;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Gender:-1.Male\n2.Female ");

        String ch = scanner.next();

        if(ch=="female" || ch=="FEMALE" ||ch == "Female" )
        {
            choice =2;

        }
        else
        {
            choice=1;
        }
        System.out.println("Enter Salary -  :");
        int sal = scanner.nextInt();
        Salary salary = new Salary();
        //  salary.findnetSalary();

        switch (choice) {

            case 1:
                if (sal > 8000) {  //male

                    tax =  5 % sal;
                    sal = (int) (sal - tax);
                    System.out.println("Net Salary :-    " + sal);
                } else {
                    tax =  2 % sal;
                    sal = (int) (sal - tax);
                    System.out.println("Net Salary :-   " + sal);
                }
                break;

            case 2:
                if (sal > 5000) {
                    tax = 3 % sal ;
                    sal = (int) (sal - tax);
                    System.out.println("Net Salary :-  " + sal);
                } else {
                    tax = 1 % sal;
                    sal = (int) (sal - tax);
                    System.out.println("Net Salary :-   " + sal);
                }
                break;


            default:
                throw new IllegalStateException("Unexpected value: " + ch);
        }

    }
}

