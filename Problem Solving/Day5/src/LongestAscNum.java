import java.util.Scanner;

//Q18.	Accept 10digit number print longest ascending number
//a.	Eg 2156897456 o/p  15689
public class LongestAscNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
//        int[] num = {2,1,5,6,8,9,7,4,5,6};
        System.out.println("Enter roll number ");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.println("Longest ASCENDING NUMBER:--");
        printLongestAscNum(num);

    }

    private static void printLongestAscNum(int[] num) {
        int c = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < num[i + 1]) {
                System.out.print(num[i]);
                c++;
            } else if (i > 1) {
                System.out.print(num[i]);
                break;
            } else {
                continue;
            }


        }
    }


}



