import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number := ");
        int num = scanner.nextInt();
        System.out.println("*****===Table="+num);
        for(int i=1 ;i<=10;i++){
            int table = num*i;  //2*1  //2*2
            System.out.println("*****==="+num+"*"+i+"="+table);
        }


    }
}
