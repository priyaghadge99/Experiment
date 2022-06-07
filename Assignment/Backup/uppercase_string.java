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
public class uppercase_string {
    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    String str = "";
    System.out.println("enter the string to print :" +str);
    str= sc.nextLine();
    
     String upper = "";
    upper = str.toUpperCase();
    
    System.out.println("Original String: "+str);
    System.out.println("Upper Case String: " +upper);
    }
}
