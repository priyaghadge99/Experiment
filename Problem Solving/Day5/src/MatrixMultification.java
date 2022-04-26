import java.util.Scanner;

public class MatrixMultification {
    static void matrixMultification(int[][] matrix1, int[][] matrix2) {
        int[][] resultmatrix = new int[3][3];

        for (int i = 0; i < 3; i++) {  //for row
            for (int j = 0; j < 3; j++) {  //for col

                resultmatrix[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    resultmatrix[i][j]+= matrix1[i][k] * matrix2[k][j]; //why?

                }
                System.out.print(resultmatrix[i][j] + " ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Matrix-- 1");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter Matrix-- 2");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("====Result-Matrix====");
        matrixMultification(matrix1,matrix2);
    }
}
//1 2 3       1  2 3      3  6  9
//1 2 3    *  1  2 3    = 3  6  9
//1 2 3       1  2 3      3  6  9

//1st row first column
//for matrix1    for matrix2
//0 1             1 0
//0 2             2 0
//0 3             3 0
//[i][k]      *      [k][j]
//i for row        //j for colum  and adding to third matrix