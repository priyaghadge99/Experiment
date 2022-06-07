/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myproject;

/**
 *
 * @author PRIYA
 */
import java.util.*;
public class rectanglestar {
    private static Scanner sc;
    public static  void main(String[] args)
    {
     int i ,j, rows,col;
     sc = new Scanner(System.in);
    
     System.out.println("enter the nof rows");
     rows= sc.nextInt();
     
     System.out.println("enter the no of cols");
     col = sc.nextInt();
     
     for(i=1;i<=rows ; i++)
         
     {
      for(j=1;j<=col;j++)
      {  
          System.out.println("*");
     
     }
      System.out.println(" \n");
    }
    
}
}