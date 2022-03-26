import java.util.Scanner;

public class Palindrome {
    static int reverse = 0;

    public void checkPalindrome(int num) {
        while (num != 0) {
            int lastdigit = num % 10;  //get a last digit  121/10 = 1
            reverse = reverse * 10 + lastdigit;  // put lastdigit in a reverse  //0*10+1 =1
            num = num / 10;  // 121 /10 = 12

        }
    }
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int num = scanner.nextInt();
        Palindrome palindrome = new Palindrome();
        palindrome.checkPalindrome(num);

        //if num =121
        //using reverse logic
        // to find lastdigit by %

        if (reverse == num) {
            System.out.println("Palindrome " + reverse + "=" + num);
        } else {
            System.out.println("Not Palindrome ");
        }

    }
}