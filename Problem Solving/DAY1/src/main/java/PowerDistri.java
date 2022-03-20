import java.util.Scanner;

public class PowerDistri {

    public static void main(String[] args) {

        PowerDistri powerDistri = new PowerDistri();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your unit count");
        int nextInt = scanner.nextInt();
        powerDistri.calculateBill(nextInt);
       // System.out.println("Bill of Your Is House is-------"+powerDistri.calculateBill(89));
    }
//c.	401-600			230+0.80pu.excess of 400
//d.	601 and above	390+1.00pu in excess of 600
    private double calculateBill(int i) {
         double  bill = 0;
        if(i<=200){
             bill = i*0.50;

            }
        else if(i>=200 || i<=400){
             bill = 100+(200*0.6);
        }
        else if(i>=401 || i<=600){
             bill = 230 +(230*0.80);
            }
        else if (i>600){
            bill = 390 + (600*1.00);

        }
        System.out.println("Bill of Your Is House is-------"+bill);  //worked
        return bill;
    }
}
