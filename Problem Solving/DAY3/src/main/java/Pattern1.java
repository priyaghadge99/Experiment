//1
//12
//123
public class Pattern1
{
    public static void main(String[] args) {
        int row = 3;
        for(int i=1;i<=row;i++)//to check size
        {
            for (int j=1;j<=i;j++){
                System.out.print(j);  //dp not println it will go to next line

            }
            System.out.println("");// for line change
//            System.out.println("1\n12\n123");

        }

    }
}
