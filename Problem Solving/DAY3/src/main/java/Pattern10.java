//   1
//  222
// 33333
public class Pattern10 {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 3; i++) {
            for (int j = 3-i; j >= 1; j--) {
                System.out.print(" ");  //print space
            }
            for (int j = 1; j <= 2 * i - 1; j++) {   //2 * i - 1    i=1 ,2-1=1  ,i=2 , 2*2-1 =3
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
