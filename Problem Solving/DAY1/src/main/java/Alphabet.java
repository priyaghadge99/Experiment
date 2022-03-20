import java.util.Scanner;

public class Alphabet {
    char A ,I, O ,U, a, i, o, u;

    public  char isVowelORNot(char ch){


        if(ch =='A' ||    ch == 'I' || ch =='O' ||ch == 'U'|| ch == 'e'){
            System.out.println( ch +"IS A VOWELS :");

        }
        else if(ch =='a' ||    ch == 'e' || ch =='i' ||ch == 'o'|| ch == 'u') {
            System.out.println("Is a vowels /: " +ch);
        }
        else
            System.out.println("Not a Vowels ");
        return ch ;
    }

}

class Main6{
    public static void main(String[] args) {

        Alphabet alphabet = new Alphabet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        char s = scanner.next().charAt(0);
        alphabet.isVowelORNot(s);


    }
}
