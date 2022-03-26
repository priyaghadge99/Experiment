import java.util.Scanner;
//Q13.	Accept start and end range from user and print  all even number between them. (two answer)
public class Even {

   public void printEvenNumber(int start , int end) {
       System.out.println("Even number : ");
       while (start < end) {
           if (start % 2 == 0 && start < end) {   //start=4
               start = start + 2;
               System.out.println("Num ==" + start);
           } else {
               start = start + 1;
               System.out.println("Num ==" + start);
           }

       }
   }
    public static void main(String[] args) {
        Even even = new Even();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num Start ");
        int start = scanner.nextInt();
        System.out.println("Enter Num End ");
        int end = scanner.nextInt();
        even.printEvenNumber(start,end);



    }
}
