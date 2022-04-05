//  1
// 121
//12321
public class Pattern7 {
    public static void main(String[] args) {
        int row=3;
        int val=1;
        for (int i=0;i<=row;i++){
            for (int j=1;j<row-i;j++){ //i=1 j=3-1=2
                /* print blank spaces */
                System.out.print(" ");

            }
            for (int j=1;j<=i;j++) //
            {
                /* Display number in ascending order upto middle*/
                System.out.print(j +" ");
            }

            /* Display  number in reverse order after middle */
            for (int j=i-1;j>=1;j--){
                System.out.print(j+" ");

            }
            System.out.println();
        }

    }
}
