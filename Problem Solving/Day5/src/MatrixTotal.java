import java.util.Scanner;

public class MatrixTotal {
    static void matrixRowTotal(int[][] matrix) {
        int total=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                   total  = matrix[i][j] + matrix[i][k];

                }
            }
            System.out.print(total);
            System.out.println();
        }
    }
    static void matrixColumnTotal(int[][] matrix) {

        for (int i = 0; i < 3; i++) {
            int total2 = 0;          //after every row/ total should reset to zero
            for (int j = 0; j < 3; j++) {
                     total2  = total2 + matrix[j][i];
                }
            System.out.print(total2);
            System.out.println();

        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matrix = new int[3][3];
        System.out.println("Enter MAtrix");
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++){
                matrix[i][j]=scanner.nextInt();
            }
        System.out.println("======Row-total=====");
        matrixRowTotal(matrix);
        System.out.println("======column-total=====");
        matrixColumnTotal(matrix);
    }
}
