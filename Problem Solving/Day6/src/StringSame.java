import java.util.Scanner;

//Q6.	Accept two string and check both are same or not
public class StringSame
{
   static boolean b=false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String 1");
        String s1 = scanner.next();
        System.out.println("Enter String 2");
        String s2 = scanner.next();
       String result= checkSameString(s1,s2);
        System.out.println(result);

    }

    private static String checkSameString(String s1, String s2) {

        for (int i=0;i<s1.length()-1;i++){
            for (int j=0;j<s2.length()-1;j++)
            {
               b=s1.charAt(i)==s2.charAt(i);

            }
        }
        if(b){
            return "both String are same";
        }
        else {
           return "not equal";
        }
    }
}
//we declared b as globally ...bcz in method if we declared b in for loop its scope is limited to that only...
//we canot write condition for it or else it automattically take defined value. thats why we have declared it globally