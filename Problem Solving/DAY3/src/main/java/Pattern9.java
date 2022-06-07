//32123
// 323
//  3
public class Pattern9 {
    public static void main(String[] args) {
        int row=3;
        int val = 0;
        for (int i=row;i>=1;i--)
        {
                for (int j = 1; j <= row -i; ++j)
                {                                     //print o space for i=row=3
                    System.out.print("  ");
                }

           // System.out.print(i);//
            for(int j=0;j<=i-1;j++){       // print 321
                System.out.print(row-j +" ");
                val = row -j;        // store last value of loop in val=1

            }
            for(int j=val+1;j<=row;j++){      //printing value after mid 23
                System.out.print(j +" ");//
            }

            System.out.println();
        }
    }
}
