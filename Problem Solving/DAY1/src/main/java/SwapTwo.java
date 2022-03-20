import java.util.Scanner;
//1.Swap without using temp
public class SwapTwo {
   private int x;  //10
    private int y;  //5

    public void swapTwo(int x,int y){
        if(x==y)
            return;
        else
            System.out.println("Before Swapping: " + "x =" + x + ", y= "+y);
            x= x+y;  //10+5 =15
            y = x-y; //15-10 =10
            x= x-y;   //15-10 = 5
           System.out.println("After swapping:"
                + " x = " + x + ", y = " + y);
    }
}
class Main{
    public static void main(String[] args) {

        SwapTwo swapTwo = new SwapTwo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X value ");
          int p= sc.nextInt();
        System.out.println("Enter Y value ");
        int q = sc.nextInt();

        swapTwo.swapTwo(p,q);





    }
        }
