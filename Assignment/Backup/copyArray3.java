/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mediumjava;

/**
 *
 * @author PRIYA
 */
import java.util.*;
public class copyArray3 {
    
    public static void main(String[] args)
    {
    int [] arr1 = { 1 , 2, 3 ,4 , 5 ,6 , 7 , 8 , 9};
    
    int [] arr2 = new int[arr1.length] ; 
    for(int i = 0;i<arr1.length;i++) 
    {
    
    arr2[i] = arr1[i];
    
    }
    
    // displaying original array arr1
    System.out.println("Displaying element of original array :");
    
    for(int i = 0;i<arr1.length;i++) 
    {
     System.out.println(arr1[i]+ " ");
    
   
    }
    
     System.out.println();
    {
      // displaying original array arr2
     System.out.println("Displaying element of new  array :");
    
    for(int i = 0;i<arr2.length;i++) 
    {
     System.out.println(arr2[i]+ " ");
    
    }
  
    }
}
}