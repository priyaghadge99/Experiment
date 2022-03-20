import java.util.Scanner;

public class Highest {

    public  int  findHighestNumber(int x,int y,int z){

        if(x>y && z<y ){
            System.out.println("Highest Number is X =" +x);
            return x;


        }
        else if( y>z && x<y){
            System.out.println("Highest Number is Y =" +y);
            return y;
        }

        else
            System.out.println("Highest Number is Z =" +z);
            return  z;
    }
}
class Main2{
    public static void main(String[] args) {

        Highest highest = new Highest();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X");
        int p =scanner.nextInt();
        System.out.println("Enter Y");
        int q =scanner.nextInt();
        System.out.println("Enter Z");
        int r =scanner.nextInt();

        highest.findHighestNumber(p,q,r);
    }
}