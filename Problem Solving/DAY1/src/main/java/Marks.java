import java.util.Scanner;

public class Marks {


    public void calculateGrade(int mark) {

        if(mark >75) {
            System.out.println("Grade A");
        }
        else if(mark>55){
            System.out.println("Grade B");

        }
        else if(mark>35){
            System.out.println("Grade C");
       }
       else {
        System.out.println("Fail");
    }
}

   // class Main7{
   //static declaration  of class are not supported in java 1.8



    public static void main(String[] args) {
        Marks marks = new Marks();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Marks:-");
        int i = scanner.nextInt();
        marks.calculateGrade(i);

    }
}

