/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myproject;

public class static_variable {
 static int roll;
 static String name;
static String college="ITS";
public static void main(String args[])
{
    
    roll =30;
    name= "priya";
    college = " TCOER";
    disp();
    
}
static void disp()
{
    System.out.println("roll number is: : " +roll);
    System.out.println("name of atudent is: : " +name);
    System.out.println("name of college is : : " +college);
}


}
    
    
