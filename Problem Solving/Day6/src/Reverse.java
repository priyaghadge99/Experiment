import java.util.Scanner;

//Q3.	Accept a string and reverse it.
public class Reverse {
    static void findReverse(String s){
        String reverse= " ";
        for (int i=0;i<s.length();i++){
            char ch= s.charAt(i);
         reverse = ch + reverse;

        }
        System.out.println("Reverse String := "+reverse);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String s = scanner.next();
        findReverse(s);

    }
}
