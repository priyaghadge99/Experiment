/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRIYA
 */
public class chainbythis {
    
   

chainbythis()
{
// calls constructor 2
this(5);
System.out.println("The Default constructor");
}
// parameterized constructor 2
chainbythis(int x){
// calls constructor 3
this(5, 15);
System.out.println(x);
}
// parameterized constructor 3
chainbythis(int x, int y)
{
System.out.println(x * y);
}
public static void main(String args[])
{
// invokes default constructor first
    chainbythis chainbythis = new chainbythis();
          }
 
}
