import java.util.Scanner;
//Q5.	Accept a number from user and reverse it.
public class Reverse {
 static   int reverse ,num;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
         num = scanner.nextInt();  //9878
        while (num!=0){
            int lastdigit = num%10 ;
            reverse = reverse*10 + lastdigit;
           num = num /10;   //987 //98 //9
        }
        System.out.println("Reverse number is : - "+reverse);
    }
}


//reverse logic
/*
* if num =9087
* lastdigit = num%10
* reverse = reverse *10 +lastdigit; // 0*10 +7 =7
* //
* again num/10  = */