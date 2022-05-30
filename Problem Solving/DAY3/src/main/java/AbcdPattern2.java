//ABCDEBCDECDEDEE
//ABCDEBCDECDEDE
//ABCDEBCDECDE
//ABCDEBCDE
//ABCDE
public class AbcdPattern2 {
    public void print() {
        String output = "";
        char alpha = 'A';
        char alpha1 ;
        String var;
        String end= "";


        int i = 0;
//            for (i = 1; i <= 5; i++) {
        for (alpha = 'A'; alpha <= 'E'; alpha++) {

//            System.out.print((char) alpha);
             output = output +alpha;
            }
//           System.out.println(output+" ");

            for (int j=1;j<2;j++)
            {
                String[] start = output.split( " ");
                for (String s1 :start){
                    System.out.print(s1);
                    end = end +s1;
                }
                String[] s = output.split( "A");
                for (String s1 :s){
                    System.out.print(s1);
                    end= end+s1;

                }
                String[] sb = output.split( "AB");
                for (String s2 : sb){
                    System.out.print(s2);
                    end = end+s2;

                }
                String[] sc = output.split( "ABC");
                for (String s2 : sc){
                    System.out.print(s2);
                    end=end+s2;

                }
                String[] sd = output.split( "ABCD");
                for (String s2 : sd){
                    System.out.print(s2);
                    end=end+s2;

                }
                System.out.println();
            }

//        System.out.println("In a for ");
//        System.out.println(end);

        String substring = end.substring(0,end.length()-1);
        System.out.println(substring);

        String substring1= end.substring(0,substring.length()-2);
        System.out.println(substring1);

        String substring2= end.substring(0,substring1.length()-3);
        System.out.println(substring2);

        String substring3= end.substring(0,substring2.length()-4);
        System.out.println(substring3);

        System.out.println("===============");
//        for (int j=0;i<=4 ;++j){
//
//            String substrings = end.substring(0,end.length()-j);
//            System.out.println(substrings);
//
//
//        }
    }




/*
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
*/
        public static void main (String[]args){
            int k = 1;
            AbcdPattern2 abcdPattern2 = new AbcdPattern2();

            abcdPattern2.print();
            System.out.println("--------------");
//         abcdPattern2.print1();


        }


    }




