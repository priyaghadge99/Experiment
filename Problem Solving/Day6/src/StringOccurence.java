import java.util.Scanner;

//Q1.	Accept string from user , accept a character from user and count the occurrence of the same
public class StringOccurence {
    static int count=0;
    static int findCountOfChar(String s , char c){

        for (int i=0;i<s.length();i++)
        {
              boolean b = s.charAt(i) == c;

              if(b){
                  count++;
              }

          }

        return count;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:- ");
        String s = scanner.next();
        System.out.println("Enter Char:- ");
        char c = scanner.next().charAt(0);  //accepting character
        int result=findCountOfChar(s,c);
        System.out.println("Count of occurance of character "+c +"= "+result);
    }
}
