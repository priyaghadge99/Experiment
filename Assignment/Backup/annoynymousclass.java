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
public class annoynymousclass {
    
    interface Eatable{
void eat();
}

public static void main(String args[]){
Eatable e=new Eatable()
{

 public void eat()
 {
     System.out.println("nice fruits");
 } 
 };
e.eat();
}
} 
    

