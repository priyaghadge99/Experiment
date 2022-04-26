import java.util.Scanner;

public class MatrixAddition {

    static void matrixAddition(int[][] matrix1, int[][] matrix2) {
        int[][] resultmatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultmatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(resultmatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3*3 matrix means 2D array
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        System.out.println("Enter Matrix 1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = scanner.nextInt();

            }
            System.out.println();
        }
        System.out.print("======================");
        System.out.println("Enter Matrix 2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        matrixAddition(matrix1, matrix2);
    }
}
