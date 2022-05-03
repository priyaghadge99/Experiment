import java.util.Scanner;

//Q4.	Accept a sentence from user and count number of words
// happy new year
public class CountString {
    static  int c=1;
    static int  countWord(String s)
    {
        for (int i =0;i<s.length()-1;i++)
        {
            if ((s.charAt(i)== ' ') && (s.charAt(i+1)!= ' '))
            {
                c++;
            }
        }
       return c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String s = scanner.nextLine();
        int result =countWord(s);
        System.out.println(result);

    }
}
