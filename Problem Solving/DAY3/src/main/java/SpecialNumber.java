import java.util.Scanner;

//Q1.	Print  all special number between 1 to 2,00,000
//a.	Eg.145
//b.	1! =1
//c.	4!=1*2*3*4
//d.	5!=1*2*3*4*5  sum of it(1+24+120=145)
/*public class SpecialNumber {

    static int fact = 1;
    static int sum = 0;
    private static int num = 2000000;

    //why static we can chnge value at runtime.
    private static boolean isSpecialnumber(int n) {
        int num = 2000000;

        for (int i = 1; i <= num; ++i) {

            int temp = n;
            while (num > 0) {
                //to find last dgit
                int lastdigit = temp % 10;
                for (int j = 1; j <= lastdigit; j++) {
                    fact = fact * j;   //to find fact
                }
                //to sum of factorial
                temp /= 10;
                sum = sum + fact;

                fact = 1;  //toreset


            }
//    private static int findFactorial(int start ,int end){
//       for(int i=1;i<=end;i++)
//       {
//        int lastdigit = i%10;
//        for(int j=1;j<=lastdigit;j++){
//            fact=fact*j;   //to find fact
//        }
//        sum=sum+fact;
//        fact=1;
//
//
//    }
//        System.out.println("Factorial := "+sum);
//       return fact;
//    }
            return sum == n;
        }


        public static void main (String[]args)
        {
            boolean hasSpecial = false;
            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <= num; i++) {
                if (isSpecialnumber(i)) {
                    System.out.println("Special Number " + i);
                    hasSpecial = true;
                }
            }
            if (!hasSpecial) {
                System.out.println("Not Special");

            }

        }

    }

}

*/