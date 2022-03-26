import java.util.Scanner;

public class SecondHighest {

    public static void main(String[] args) {
        int fbig=0 ,sbig=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you wanna enter: = ");
        int count = scanner.nextInt();
        System.out.println("enter number := ");
        while(count>0){
            int num = scanner.nextInt();

            //without using array

            if(num>fbig) {
                sbig=fbig;
                fbig=num;   //fbig madhe value store
            }
            if(num> sbig && num<fbig)   //fbig peksha small and sbig peksha greater
            {
                sbig=num;
            }
            count--;
        }
        System.out.println("Second Highest: == "+sbig);
        System.out.println("First Highest: == "+fbig);
    }
}
