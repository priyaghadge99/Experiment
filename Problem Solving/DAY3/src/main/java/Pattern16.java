
// --**--
// -*--*-
// *----*
public class Pattern16 {
    public static void main(String[] args) {
        for (int i =0;i < 3; i++) {
            for (int j = 2 - i; j >= 1; j--) {    //2-i =2-0  =2 ,1
                System.out.print("-");             //--
            }
            for (int m = 1; m <= 2; m++) {
                System.out.print("*");             //*
                if (m==1){
                    for (int k=0;k<2*i;k++){         // 2*i =2*0 = 0 false condition :not print for first one
                        System.out.print("-");
                    }
                }
            }
 //-----------------------------------------------------------

            for (int j = 0; j < 3-i-1; j++) {   //2-i =2-0  =2 ,1
                System.out.print("-");
            }
            System.out.println();
        }

    }
}


//--**--
//-****-
//******


// if(j==i || j==rows || i==1){
//         System.out.print("*");
//         }
//         else{
//         System.out.print(" ");
//         }