//Q10.	Print all prime number between 51 to 100
public class Prime51to100 {

    public static void main(String[] args) {
        for (int num = 51; num <= 100; num++) {
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
}
