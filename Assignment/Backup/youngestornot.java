/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRIYA
 */
import java.util.*;
public class youngestornot
        
{
   private static Scanner sc;
    
    public static void main(String[] args)
    {
       
        sc = new Scanner(System.in);
       
        System.out.println("enter age of x :");
         int x = sc.nextInt();
        
        System.out.println("enter age of y :" );
        int y = sc.nextInt();
        
        System.out.println("enter age of z" );
        int z = sc.nextInt();
      
    if(x<y && x<z)
    {
        System.out.println("x is the youngest of three");
        
    }
    else if(y<x && y<z)
    {
        System.out.println("y is youngest throuthout :");
    }
    else if((z<y)&& (z<x ))
    {
          System.out.println("z is youngest throuthout :");
    }
    else
    {
          System.out.println("all are same ages:");
    }
    
    }
     
} 