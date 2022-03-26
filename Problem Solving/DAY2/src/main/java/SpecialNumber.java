import java.util.Scanner;

//Q8.	Accept a number from user check if it is special number or not
//a.	Eg.145
//b.	1! =1
//c.	4!=1*2*3*4
//d.	5!=1*2*3*4*5  sum of it(1+24+120=145)
public class SpecialNumber {
 static   int  fact=1;
    static int sum=0;

    public static void findfactSum(int num){
        while (num!=0) {
           int lastdigit = num % 10;   //5
            for(int j=1;j<=lastdigit;j++){
                fact =fact * j;
            }
            num=  num/10;  //145/10 ==14
            sum = sum + fact;
            fact=1;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpecialNumber specialNumber = new SpecialNumber();
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        specialNumber.findfactSum(num);
        System.out.println("SUM "+sum);

        if(sum==num){
            System.out.println("Number is special ");

        }
        else{
            System.out.println("number is not Special");
        }
    }


}
