import java.util.Scanner;

//Q15.	Accept marks and roll number of 10 students and display marks in ascending order
public class Marks {
    static void printMarksAscending(int[] marks ,int[] roll){
        //
        for(int i=0;i<marks.length;i++) {
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] > marks[j]) {   //condition for swapping
                    int temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }

        for(int i=0;i<marks.length;i++){
            System.out.println("Marks "+marks[i]);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roll[] = new int[10];
        int marks[] = new int[10];

        System.out.println("Enter roll number ");
        for(int i=0;i<roll.length;i++){
         roll[i] = scanner.nextInt();
        }
        System.out.println("Enter marks number ");
        for(int i=0;i<marks.length;i++){
            marks[i] = scanner.nextInt();
        }
        printMarksAscending(marks,roll);
    }
}
