import java.util.Scanner;

//Q11.	Read a five-letter word into the computer, then encode the word on a letter-by-letter basis by
//subtracting 30 from the numerical value that is used to represent each letter. Thus if the ASCII
//character set is being used, the letter a (which is represented by the value 97) would become a C
//(represented by the value 67), etc.
//Write out the encoded version of the word. Test the program with the following words: white, roses,
//Japan, zebra.
public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input");
        //        String s1 = scanner.nextLine();
        //        String s2 = scanner.nextLine();
        //        String s3 = scanner.nextLine();
        //        String s4 = scanner.nextLine();
        String s1 = "white";
        String s2 = "roses";
        String s3 = "Japan";
        String s4 = "zebra";
        print(s1, s2, s3, s4);


    }

    private static void print(String s1, String s2, String s3, String s4) {

        int length = s1.length();

        for (int i = 0; i < length; i++) {
            char c = s1.charAt(i);
            int ascii1 = (int) c;
            int i1 = ascii1 - 30;
            System.out.print(c + " = " + i1 + " ");
        }
        System.out.println("");
        int length2 = s2.length();

        for (int i = 0; i < length; i++) {
            char c = s2.charAt(i);
            int ascii2 = (int) c;
            int i2 = ascii2 - 30;
            System.out.print(c + " = " + i2 + " ");
        }
        System.out.println("");
        int length3 = s3.length();

        for (int i = 0; i < length; i++) {
            char c = s3.charAt(i);
            int ascii3 = (int) c;
            int i3 = ascii3 - 30;
            System.out.print(c + " = " + i3 + " ");
        }
        int length4 = s4.length();
        System.out.println("");
        for (int i = 0; i < length; i++) {
            char c = s4.charAt(i);
            int ascii4 = (int) c;
            int i4 = ascii4 - 30;
            System.out.print(c + " = " + i4 + " ");
        }


    }
}
