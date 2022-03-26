import java.util.Scanner;

public class Odd {

    private void printOddNumber(int start, int end) {

        System.out.println("Odd number : ");
        while (start < end) {
            if ((!(start % 2 == 0)) && start < end) {   //start=5
                start = start + 2;  //start+=2
                System.out.println("Num ==" + start);
            } else {                      //start = 4
                                                // 4+1
                start+=1;  //start+=1
                System.out.println("Num ==" + start);
            }

        }
    }
    public static void main(String[] args) {
       Odd odd = new Odd();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num Start ");
        int start = scanner.nextInt();
        System.out.println("Enter Num End ");
        int end = scanner.nextInt();
        odd.printOddNumber(start,end);



    }

}


