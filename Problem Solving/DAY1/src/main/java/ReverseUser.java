import java.util.Scanner;

public class ReverseUser {
    String str;
    String str2 = "";
    char ch;

    public String reverseString(String str){
        for(int i=0 ;i<str.length();i++){
           ch = str.charAt(i); //extract character
            str2 = ch +str2; //adds each character in front of the existing string


        }
        System.out.println("Reversed word: "+ str2);
       return str2.toString();
    }
}
class Main5{
    public static void main(String[] args) {

        ReverseUser reverseUser = new ReverseUser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:-");
        String s = scanner.next();
        reverseUser.reverseString(s);
        System.out.println("ReverseString is = "+ reverseUser.str2);
    }
}