import java.util.Scanner;

public class PrimeNext {
    public void primeNext(int no ) {
        int num = 0;
        for(num=no;num<1000;num++)
        if (num > no) {
            int m = 0, flag = 0;
            m = num / 2;
            if (num == 0 || num == 1) {
                System.out.println("not a prime");
            } else {
                for (int i = 2; i <= m; i++)
                    if (num % i == 0) {
//                        System.out.println(num + " not a prime");
                        flag = 1;
                        break;

                    }
                if (flag == 0) {
                    System.out.println(num + " is a prime");
                }
            }
        }
    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeNext primeNext = new PrimeNext();
        System.out.println("Enter number: - ");
        int no = scanner.nextInt();
        primeNext.primeNext(no);


    }
}
