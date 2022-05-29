
//   *
//  * *
// * * *
//* * * *

public class Pattern13 {
    public static void main(String[] args) {
        int row=4;
        for (int i=1;i<=row;i++){
            //to print spaces
            for (int j=row-i;j>=1;j--){      // 4-1 = 3   3  2 1   3space
                System.out.print(" ");

            }
            //to print star
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
