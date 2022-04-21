public class Fibonacci {
   static  int n1=0,n2=1,n3;
    static void fabonacci(int count){
        if(count >0){
            n3= n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fabonacci(count-1);
        }

    }
    public static void main(String[] args) {
//logic
        //if 0 1 1 2 3 5 8 13 21
        //0+1=1 1+1=2 ...
        int c=10;
        System.out.print(n1 +" " +n2);
        fabonacci(c-2); //reduce count 2 bcx n1 an n2 already printed.


    }
}
