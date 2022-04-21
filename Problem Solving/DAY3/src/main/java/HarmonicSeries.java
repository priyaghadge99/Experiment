import java.util.Scanner;

//Q13.	Write a program to determine and
// print the sum of the following harmonic series for a given value if n1+1/2+1/3+….1/n
public class HarmonicSeries {
    public  static   double  sum(int n){
        double result=0.0 ,s=0.0;
        //printing

        for (double i=1;i<=n;i++) {
            s = s + (1 / i);
          // System.out.println(s);

        }

        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element");
        int nextInt = scanner.nextInt();
        System.out.println("Sum is = "+sum(nextInt));
//        HarmonicSeries harmonicSeries = new HarmonicSeries();
//        harmonicSeries.sum(nextInt);
    }
}
