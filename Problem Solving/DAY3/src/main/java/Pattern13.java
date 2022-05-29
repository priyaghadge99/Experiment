
//   *
//  * *
// * * *
//* * * *

public class Pattern13 {
    public static void main(String[] args) {
        int row=4;
        for (int i=1;i<=row;i++){

            for (int j=row-i;j>=1;j--){      // 4-1 = 3   3  2 1
                System.out.print(" ");

            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
