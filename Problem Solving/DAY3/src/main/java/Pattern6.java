//  1
// 2 2
//3 3 3
public class Pattern6 {
    public static void main(String[] args) {
        int row=3;
        int val=1;
        for(int i=1;i<=row;i++){
            for(int j=row-i;j>=1;--j)  //imp 3-1=2 2>1  then space
                //left side space
            {
                //System.out.print(""+val+" ");
                System.out.print(" ");

            }
            for(int j=1;j<=i;++j){  //j=1

                    System.out.print(i+" ");   //<-//middle space
                }
                System.out.println("");
            }

        }


    }

