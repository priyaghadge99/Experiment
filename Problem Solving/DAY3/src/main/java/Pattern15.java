
// 1   1
//   2
// 3    3
public class Pattern15 {
    public static void main(String[] args) {

        for (int i=1;i<=3;i++) {
            if (i % 2 == 0)//space{
            {
                System.out.print(" ");
            }

                for (int j = 1; j <= i; j++) {

                    System.out.print(i  +" " +i);
                }
//           }
                System.out.println();
            }


    }
}
