//ABCDEBCDECDEDEE
//ABCDEBCDECDEDE
//ABCDEBCDECDE
//ABCDEBCDE
//ABCDE
public class AbcdPattern2 {
    public char print ()
    {
        String output = "";
        char alpha = 'A';

            int i=0;
            for (i = i + 1; i <= 5; i++) {
                for (alpha = 'A'; alpha <= 'E'; alpha++) {
                System.out.print((char) alpha);
            }
        }
        System.out.println();
        return alpha;
    }

    public char print1(){
      //  System.out.print(print());
        char alpha2 = (print());
        String s=Character.toString(alpha2);//to chrcter string  conversion
        int length = s.length();
//
//        for(int i=0;i< length ;i++){
            System.out.println(length);
            System.out.println("-----------------");
//        }
         return alpha2;

    }
    public static void main(String[] args) {
        int k = 1;
    AbcdPattern2 abcdPattern2 = new AbcdPattern2();

    abcdPattern2.print();
        System.out.println("--------------");
    abcdPattern2.print1();


    }


}



