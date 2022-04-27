import java.util.Scanner;

//Q12.	Accept data in 4*4 matrix and transpose it(row che col n col che row)
public class MatrixTranspose {
    static void transposeMatrix(int[][] matrix1) {
        int[][] transposeMatrix = new int[4][4];
        for (int i = 0; i < 4; i++) {  //for row
            for (int j = 0; j < 4; j++) {  //for col
                transposeMatrix[i][j] = matrix1[j][i];
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        //4*4 means 3D array
        int[][] matrix1 = new int[4][4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Matrix-- 1");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("==========Transpose Matrix==========");
        transposeMatrix(matrix1);
    }

}


