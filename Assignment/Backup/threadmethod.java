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


class D extends Thread
{
public void run()
{
 for(int i=0;i<5;i++)
 {
 if(i==0) 
 yield(); //Transfer Control to B when i=0

 System.out.println("From Class D i ="+i);
 }
}
}
class E extends Thread
{
public void run()
{
 for(int i=0;i<5;i++)
 {
 if(i==2) 
     
 stop(); //Kill B when i=2

 System.out.println("From Class E i ="+i);
 }
}
}

class F extends Thread
{
public void run()
{
 for(int i=0;i<5;i++)
 {
 if(i==1)
 {
 try
 {
 sleep(1000); //Go to Sleep when i=1 Woke up after 1000 millisecond
 }
 catch(Exception e)
 {

 }
 }
 System.out.println("From Class F i ="+i);
 }
}
}

public class threadmethod {
    
    public static void main(String[] args)
{
 new D().start();
 new E().start();
 new F().start();
 
}
    
}
