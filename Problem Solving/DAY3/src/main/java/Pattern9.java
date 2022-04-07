//32123
// 323
//  3
public class Pattern9 {
    public static void main(String[] args) {
        for (int i=3;i>=1;i--){
            for (int j = i-2; j >= 3; j++) {      /* print blank spaces */
                System.out.print(" ");
            }

           // System.out.print(i);//
            for(int j=3;j>=1;j--){
                System.out.print(j);//

            }
            for(int j=2;j<=i;j++){
                System.out.print(j);//
            }
            System.out.println();
        }
    }
}
