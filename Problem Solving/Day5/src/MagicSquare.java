import java.util.Scanner;

public class MagicSquare {
    static boolean checkMagicSquareMatrix(int[][] matrix){

        int sumd1=0,sumd2=0;
        for (int i=0;i<3;i++){
            sumd1+=matrix[i][i];    //top left and bottom right
            sumd2+=matrix[i][3-1-i];

        }
        if(sumd1!=sumd2){
//            System.out.println("Not a Magic Square");
            return false;
        }
        for (int i=0;i<3;i++) {
            int totalrow=0,totalcol=0;
            for (int j = 0; j < 3; j++) {
                totalrow +=  matrix[i][j];
                totalcol+=  matrix[j][i];
            }
            int sum= totalcol+totalrow;
//          System.out.print("Total Row and Column addition:= "+sum);
            System.out.println();
            if( totalcol!=totalrow || totalcol!=sumd1 || totalrow!=sumd2){
                System.out.println("TotalRows:-"+totalrow +"\n"+"TotalColumns:-"+totalcol);
                System.out.println("Not Magic square Matrix");
                return false;
            }
            else {
                System.out.println("MagicSquare");
                return true;     //if not here check three above condition otherwise skip
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int [][] matrix = new int[3][3];

        int matrix[][] =
                {{ 2, 7, 6 },
                { 9, 5, 1 },
                { 4, 3, 8 }};
//        System.out.println("Enter MAtrix");
//        for (int i=0;i<3;i++)
//            for (int j=0;j<3;j++){
//                matrix[i][j]=scanner.nextInt();
//            }
        System.out.println("Check Magic Sqaure Matrix:--");
        checkMagicSquareMatrix(matrix);
    }
}
//1. Find the sum of prime diagonal and secondary diagonal.
//2. Calculate the sum of each row and column.
//3. If the prime diagonal and secondary diagonal sums are equal to every row’s sum and every column’s sum,
// then it is the magic matrix.

//Sum in each row & each column = 3*(32+1)/2 = 15