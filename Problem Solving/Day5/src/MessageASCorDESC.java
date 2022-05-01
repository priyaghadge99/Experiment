import java.util.Scanner;

//Q17.	Accept 5 number in an array and display message entered data is in ascending/descending or not sorted
public class MessageASCorDESC {
//    static int count1 = 0;
//    static int count2 = 0;
//    static int count3 = 0;
//    static int flag = 0;
    static boolean desc=true;
    static boolean asc=true;
//    private static boolean isnotSorted;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] roll = new int[5];
        System.out.println("Enter roll number ");
        for (int i = 0; i < roll.length; i++) {
            roll[i] = scanner.nextInt();
        }
        printMessage(roll);

    }

    private static void printMessage(int[] roll) {

        for (int i = 0; i < roll.length; i++) {

            asc = asc && roll[i] < roll[i + 1];
            desc = desc && roll[i] > roll[i + 1];

            if (asc) {
                System.out.println("ASCENDING");
            }
            else if (desc) {
                System.out.println("DESCNDING");
            } else  {
                System.out.println("NOT SORTED");
            }
        }
    }
}

  /*   for (int j = i + 1; j < roll.length; j++) {

                if (roll[i] < roll[j]) {
//                    System.out.println("ASCENDING");

                    count1++;
                    flag = 1;
                    asc=true;

                } else if (roll[j] > roll[i]) {
//                    System.out.println("DESCNDING");
                    count2++;
                    flag = 2;

                } else {
//                    System.out.println("NOT SORTED");
                    count3++;
                    flag = 3;

                }
            }



*/