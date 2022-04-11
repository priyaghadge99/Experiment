//ABCDEFGHIJKLMNOPQRST
//        ACEGIKMOQS
//        ADGJMPS
//        AEIMO

public class AbcdPattern1 {

    public void print1() {
        for (int i = 20, n = 1; i >= 20; i--, n += 2) {
            int aplha = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) aplha);
                aplha++;
            }
            System.out.println();
        }
    }

    public void print2() {
       char alpha;
            for (char aplha = 'A' ; aplha<='S';aplha++) {
                System.out.print((char) aplha);
                aplha++;
            }
            System.out.println();
        }

    public void print3() {
        char alpha;
        for (char aplha = 'A' ; aplha<='S';aplha++) {
            System.out.print((char) aplha);
            aplha+=2;

        }
        System.out.println();
    }

    public void print4() {
        char alpha;
        for (char aplha = 'A' ; aplha<='S';aplha++) {
            System.out.print((char) aplha);
            aplha+=3;

        }
        System.out.println();
    }
    public static void main(String[] args) {

        AbcdPattern1 abcdPattern1 = new AbcdPattern1();
        abcdPattern1.print1();
        abcdPattern1.print2();
        abcdPattern1.print3();
        abcdPattern1.print4();

    }
}

