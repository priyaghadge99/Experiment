
// 1   1
//   2
// 3    3
public class Pattern15 {
    public static void main(String[] args) {

        for (int i=1;i<=3;i++) {
            if (i== 2 )//space{
            {
                System.out.print(" ");
            }

                for (int j = 1; j <= i; j++) {

                    for (int k=1;k==j;k++) {
                        if (i%2==0){
                            System.out.print(i);
                        }
                        else {
                            System.out.print(i + " " + i);
                        }
                    }
                }
//           }
                System.out.println();
            }


    }
}


//1 1
// 2 22 2
//3 33 33 3
//solved