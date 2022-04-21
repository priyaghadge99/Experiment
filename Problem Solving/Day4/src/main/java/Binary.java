//Q2.	Find binary of a number
//logic                  remainder
//num/2  = 20/2 =10   ->  0
//         10/2=5 -->    0
//          5/2 =2 --    1
//           2/2 =1      0
//           1/2= 0 ->    1
//ans = 10100
public class Binary {

    static  int binaryConversion(int num){
        if(num==1){
            System.out.println();
            return 1;


        }else {
            System.out.println(num);
            System.out.println("==========");
            return binaryConversion(num/2)*10 +(num%2);   //10/2 *10 + 5%2=

        }

    }
    public static void main(String[] args) {
       int num=20;
        System.out.println(binaryConversion(num));

    }
}
