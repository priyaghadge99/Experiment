import java.util.Scanner;
//Q2.	 Do the same example above but you program should not exit unless user enter choice “c”
public class UserChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Choice: -- ");
        char choice;
        choice = scanner.next().charAt(0);  //read a character
        //cast to character.
        //cant used continue in switch.
//        do {
            switch (choice) {
                case 'a':
                    System.out.println("Square");
//                    break;


                case 'b':
                    System.out.println("Cube");
//                    break;


                case 'c':
                    System.out.println("Exit");
//                    break;

                default:
                    System.out.println("please enter valid choice");

                    System.out.println("Do you want to continue: y/n");
                    char anInt = scanner.next().charAt(0);
                    if (anInt == 'Y' || anInt == 'y') {
                        System.out.println("Enter your Choice: -- ");
                        choice = scanner.next().charAt(0);

                    } else {
                        if (choice == 'c')
                            System.exit(0);
                    }
            }
//        }while (choice=='c');
    }
    }



