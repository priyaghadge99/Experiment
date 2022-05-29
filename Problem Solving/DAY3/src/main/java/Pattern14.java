//  321
//  32
//  3

public class Pattern14
{
    public static void main(String[] args) {
        for (int i=1;i<=3;i++){       // for rows
            for (int j=3;j>=i;j--){         // 3 2 1  bcz >1
                                            // 3 2 bcz >=2
                System.out.print(j);     //print numbers
            }
            System.out.println();

        }

    }
}
