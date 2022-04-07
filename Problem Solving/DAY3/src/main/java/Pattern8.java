//  1
// 121
//12321
public class Pattern8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 3 - i; j >= 1; j--) {      /* print blank spaces */
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {  /* Display number in ascending order upto middle*/
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {   /* Display  number in reverse order after middle */
                System.out.print(j);
            }
            System.out.println();    /* Go to next line*/

        }
        for (int i = 2; i >= 1; i--) {
            for (int j = 3 - i; j >= 1; j--) {      /* print blank spaces */
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {  /* Display number in ascending order upto middle*/
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {   /* Display  number in reverse order after middle */
                System.out.print(j);
            }
            System.out.println();    /* Go to next line*/

        }

    }
}
//i=1
//j=2
//
//
//in 2nd loop print j=2