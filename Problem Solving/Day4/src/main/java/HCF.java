public class HCF {
    static  int findHCF(int n1 ,int n2){
        if(n2!=0){
            return findHCF(n2,n1%n2);
        }
       else {
           return n1;
        }

    }
    public static void main(String[] args) {

        int n1=366 , n2=60;
        int hcf = findHCF(n1,n2);
        System.out.println("HCF of "+n1+ " & "+n2+ " = " +hcf );

    }
}


//No.	Recursive call	n1	n2	n1 % n2
//1	  hcf(366, 60)	   366	60	6
//2	  hcf(60, 6)	  60	 6 	0
//Final	hcf(6, 0)	 6	   0	-