//   0
//  101
// 21012
//mirror image

public class Pattern11 {
    public static void main(String[] args) {
        //for rows

        int var1 = 1, var2=1;
        for (int i=1;i<=3;i++){

            for (int j = 3-i; j >= 1; j--) {
                System.out.print(" ");  //print space
            }

            for (int j=1;j<=var1;j++){                   // logic
                                                         // 1-1=0    print 0    var1=3
                                                            // j=1   1<=3   3 time loop will iterate  1. 1-2 =1
                                                            // j=2    2<=3                            2. 2-2 =0
                System.out.print(Math.abs(j-var2));         // j=3    3<=3                            3. 3-2= 1  var2= 3
            }

            var1+=2;                                       // var1= 5    var2 =3
            var2++;                                        //  j=1    1-3 =2
                                                           // j=2    2-3 =1
            System.out.println();                         // j=3    3-3=0
        }                                                 // j=4     4-3 =1
                                                         // j=5     5-3 =2

    }
}
