import java.util.Scanner;

//Q10.	Accept a start and end range of a character,eg start A end F
//a.	Ask user to enter any character between that range
//b.	You have to print which character user has not entered
//c.	Eg input start A end F entered character by user are BEF o/p ACD
public class Program10 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start range ");
        char start =scanner.next().charAt(0);
        System.out.println("Enter start range ");
        char end =scanner.next().charAt(0);
        System.out.println("Enter character");
        int i=0;
        char s = scanner.next().charAt(i);
        System.out.println("character user has not entered");
        print(start ,end ,s);
    }

    private static void print(char start, char end, char s) {
        for (char i=start ; i<end;i++ ){
            if(s==i){
              continue;
            }

            System.out.print(i +" ");
        }
    }
}
