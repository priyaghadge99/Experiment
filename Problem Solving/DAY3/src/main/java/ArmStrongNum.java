//a.	Eg 153
//b.	1 cube
//c.	5 cube
//d.	3 cube   sum of it (1+27+125=153)
//Print  all Armstrong number between 100 to 999


import static java.lang.Math.pow;

public class ArmStrongNum {

    static int num = 150;

    public static void main(String[] args) {
        ArmStrongNum armStrongNum = new ArmStrongNum();
        for (num = 100 + 1; num <= 999; ++num) {

            //to calculate digit..
            int originalNo = num;
            int digits = 0;
            int sum = 0;
            while (originalNo != 0) {
                originalNo = originalNo / 10;
                digits++;
            }
            //again have to assign as originalNo get 0
            originalNo = num;
            while (originalNo != 0) {
                int lastdigit = originalNo % 10;
                    sum = (int) (sum + pow(lastdigit, digits));

                    originalNo /= 10;
                }

                if (sum == num) {
                    System.out.println("Number is Armstrong");
                }
            }
        }
    }


