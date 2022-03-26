import java.util.Scanner;
//Q17.	Accept a number from user accept a digit from user and check the occurrence of that digit
public class DigiOcurrance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :--");  //22222189
        int num = scanner.nextInt();
        System.out.println("Enter Digit :--"); // 2
        int digit = scanner.nextInt();

        int count=0;
        while(num!=0){
          int lastdigit = num%10;
          if(lastdigit==digit)
          {
                count++;
            }
          num/=10;

        }
        System.out.println("Count = " +count);


    }
}
