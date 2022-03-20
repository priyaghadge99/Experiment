
import java.util.Scanner;
public class PolygonStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of four sides:--");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        PolygonStatus polygonStatus = new PolygonStatus();
        System.out.println("Length of Sides:==: "+a+ ","+b+","+c+","+d+".");
        polygonStatus.polygonStatus(a,b,c,d);
        polygonStatus.squareStatus(a,b,c,d);
    }
    //check sum of 3 sides = 4th side
    private  void polygonStatus(int w ,int x ,int y ,int z ){
        boolean a = w + x + y != z;
        boolean b=  w + y + z!= x;
        boolean c=  x + y + z != w;
        boolean d=  w + x + z != y;
        char ch;
   if(a){
       System.out.println("polygon status :== 1");
   }else if(b){
       System.out.println("polygon status :== 1");
   }
   else if (c){
       System.out.println("polygon status :== 1");
   }
   else if (d){
       System.out.println("polygon status :== 1");
   }
   else {
       System.out.println("polgoan status :== 0");
   }
   return ;
    }

    private  void squareStatus(int w ,int x ,int y ,int z ){
          w=x=y=z;
        if(w!=0 && x!=0 && y!=0 && z!=0){
            System.out.println("Square status :== 1" );

        }
        else {
            System.out.println("Square status :== 0" );
        }
    }
}



//Q13.	Problem: Given the length of four sides determine whether they can be used to create a polygon
// and determine if that polygon is a square.
// A polygon can be created if no single side is greater than the sum of the other three sides.
// Display a ONE when the status (polygon or square) is confirmed and ZERO when the status cannot be confirmed.
//
//Example Execution #1:
//Enter the length of the four sides: 4 3 2 9
//Length of sides: 4, 3, 2, 9
//Polygon status: 0
//Square status: 0