import java.util.Scanner;

//Q5.	Accept  two string append 1st one with the second one
public class StringAppend {
    static String appendString(String s1,String s2)
    {
        String s3="";
        s3= s2+s1;  //append 1st one with the second one
        return s3;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String first");
        String s1 = scanner.nextLine();
        System.out.println("Enter String second");
        String s2 = scanner.nextLine();
        String s= appendString(s1,s2);
        System.out.println("result "+s);

    }
}
