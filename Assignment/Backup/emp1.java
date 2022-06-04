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
import java.io.InputStream;
import java.util.Scanner;
public class emp1 
{
    
    public static void main(String args[])
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the name of an employee");
        String name = SC.next();
        System.out.println("enter the salary");
        int sal = SC.nextInt();
        
    
        System.out.println("name of an employee:"+name);
   
        System.out.println("salary of an employee:"+sal);
     }
}