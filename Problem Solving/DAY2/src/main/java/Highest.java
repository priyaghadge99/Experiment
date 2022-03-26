import java.util.Arrays;
import java.util.Scanner;
//Q18.	Accept 10 number from user and print highest number*
public class Highest {
   int large=0 ,small=0;

    public static void main(String[] args) {
         int c = 0;
        Highest highest = new Highest();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num ");
        for(int i=1;i<=10;i++) {
            int num = scanner.nextInt();
            c++;
            System.out.println("num is "+num);

            if(c==1 )
            {
                highest.large=highest.small=num;
            }
             if(num< highest.small){
                highest.small= num;
            }
             if(num> highest.large){

                highest.large=num;
            }
//            int[] arr = new int[num];
//            System.out.println(arr.length +"," + );//1,2,3,4

        }
        System.out.println("largest number "+ highest.large);
        System.out.println("Smallest number "+highest.small);

    }
}
