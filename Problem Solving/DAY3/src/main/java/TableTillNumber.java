import java.util.Scanner;

//Q3.	Accept a number from user and print table till that number
//a.	Input 2
//b.	o/p
public class TableTillNumber {

    public void printTableTillNumber(int input,int output) {
        for (int i = 1; i <= output; i++)
        {
            int table=input * i;

            System.out.println("Table:" +input+ "*"+i+ "=" +table);
            if(table==output){
                break;
            }

        }

    }
    public void printTable(int output) {  //print table till table 10 come logic ;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= output; j++) {
                int table1 = i*j;
                System.out.println(i+"*"+j+"="+table1);

            }

        }
    }

    public static void main(String[] args) {
        TableTillNumber tableTillNumber = new TableTillNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the inputNum:");
        int inputNum = scanner.nextInt();
        System.out.println("Enter the OutputNum:");
        int outputNum = scanner.nextInt();

        tableTillNumber.printTableTillNumber(inputNum,outputNum);
        System.out.println("==================================");
        tableTillNumber.printTable(outputNum);

    }
}
