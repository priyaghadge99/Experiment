//32123
// 323
//  3
public class Pattern9 {
    public static void main(String[] args) {
        int row=3;
        for (int i=row;i>=1;i--)
        {
//            for (int j = i -2; j >= 3; j++) {      /* print blank spaces */  // 3-2 = 1   j>=3 :false
                                                        //if row =2  2-2 =0  j>=

                for (int j = 3 - i; j >= 1; j--)
                {                                     // 3-1 =2   2<
                    System.out.print(" ");
                }

           // System.out.print(i);//
            for(int j=3;j>=1;j--){       //printing j upto middle 321
                System.out.print(j);//

            }
//            for(int j=2;j<=i;j++){      //printing value after mid 23
//                System.out.print(j);//
//            }

            for (int j=3;j<=i;j++){
                int value=1;
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }
}
