
// --**--
// -*--*-
// *----*
public class Pattern16 {
    public static void main(String[] args) {
        for (int i =1;i<=3; i++){
            for (int j=3-i;j>=1;j--){    //3-1 =2  2 ,1
                System.out.print("-");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=3-i;j>=1;j--){    //3-1 =2  2 ,1
                System.out.print("-");
            }
            System.out.println();
        }


    }
}
