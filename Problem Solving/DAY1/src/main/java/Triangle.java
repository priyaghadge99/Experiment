import java.util.Scanner;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sides of a triangle:-");
        int a = scanner.nextInt();
        int b =scanner.nextInt();
        int c =scanner.nextInt();
        Triangle triangle = new Triangle();
        triangle.checkIsoAngle(a,b,c);
        triangle.checkEquilateral(a,b,c);
        triangle.checkForInvalid(a,b,c);
        triangle.checkRightAngle(a,b,c);
    }

    private void checkRightAngle(int a,
                                 int b,
                                 int c){

        double v = Math.pow(c, 2) + Math.pow(b, 2);
        double w = Math.pow(a, 2) + Math.pow(b, 2);
        double z = Math.pow(c, 2) + Math.pow(a, 2);

        if( Math.pow(a,2)==v || Math.pow(c,2)==w || Math.pow(b,2)==z){
            System.out.println("Right Angle");

     }

    }

    private void checkIsoAngle(int a,
                                 int b,
                                 int c){

       if(a==b ||b==a|| c==a){
           System.out.println("Isosceles");
       }
    }
    private void checkEquilateral(int a,
                               int b,
                               int c){


        if(a==b && b==a && c==a){
            System.out.println("Isosceles");
        }
    }

    private void checkForInvalid(int a, int b ,int c){
        if(a+b>c || c+a>b || c+b >a){
            System.out.println("Invalid");
        }
        else
        {
            System.out.println("notSpecial");
        }
    }
}

/*
* Problem Statement:
Consider a triangle with three sides measuring a, b, and c units. A triangle is a right-angled triangle if
a 2 + b2 = c2

Allow a tolerance of 0.000001 in the comparison in the above case i.e
a2 + b2 = c2 +/- 0.000001

A triangle is an isosceles triangle if any two of its sides are equal.
A triangle is an equilateral triangle if all the three sides are equal.

Three values can be the dimensions of a triangle if and only if the sum of every pair of values isgreater than the third value. Otherwise, it is an invalid triangle.
a+b >c else invalid
Write a program that reads three real numbers and finds out whether they can be the sides of thetriangle and
* if they do, prints what type of triangle it is. Even though all equilateral triangles are isosceles, your program should classify an equilateral triangle to be an equilateral only. Similarly
isosceles right-angled triangles should be classified as right-angled and not isosceles.
*  A valid trianglewhich does not belong to any of the special types belongs to the notspecial category.
The three sides will be given as real numbers separated by blanks.
* The program should print the typeof the triangle in words using lower case letters followed by eoln
* without any blanks.
Thus the possible answers are
invalid
right-angled
isosceles
equilateral
notspecial
*/