//         1
//        121
//       12121


public class Pattern12 {
    public static void main(String[] args) {
        //for rows

        for (int i=1;i<=3;i++){

            for (int j = 3-i; j >= 1; j--) {
                System.out.print(" ");  //print space
            }

            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int j=1;j<i;j++){
                System.out.print(j +"");
            }
            System.out.println();
        }


    }
}
