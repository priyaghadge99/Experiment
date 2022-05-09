import java.util.Scanner;

//Q9.	Accept a string ,accept a character and delete all occurrence of that character
// Write a program to extract the portion of a string and print the extracted string.
// Assume that m characters are extracted, starting from n character
public class Program9 {
    static String output;
    static void remove(String s1, char s2) {
        for (int i = 0; i < s1.length() - 1; i++) {
            if (s1.charAt(i) == s2) {
                String output =s1.replace(s2,' ' );
                String result = output.replaceAll("\\s",""); // to remove spaces
                System.out.println("Result String "+result);
            }
        }
    }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter String ");
            String s1 = scanner.next();
            System.out.println("Enter Character ");
            int i = 0;
            char s2 = scanner.next().charAt(i);
            remove(s1, s2);


        }
    }

