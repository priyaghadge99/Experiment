import java.util.Scanner;

//Q1.	Give choice to user
//a.	square
//b.	Cube
//c.	 exit
//as per user choice display result if user enter invalid choice give appropriate message.

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Choice: -- ");
        int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Square");
                    break;
                case 2:
                    System.out.println("Cube");
                    break;

                case 3:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("please enter valid choice");
            }
        }
    }


