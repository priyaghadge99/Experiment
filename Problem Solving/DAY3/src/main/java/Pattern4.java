//	1
// 21
//321
public class Pattern4 {
    public static void main(String[] args) {
        int row = 3;
        for (int i = 1; i <= row; i++) {  //
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");

            }

                for (int j = 1; j <= i; j++)
                {
                    System.out.print(j);
                }
            System.out.println();
            }

        }
    }



/*Iteration 1--

i=1
j=1

 */