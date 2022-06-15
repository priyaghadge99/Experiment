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
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class addqueue1
{   private static Scanner Q;
    public static void main(String[] args)
    {
    Queue<Integer> Q = new LinkedList<>();
    
   
    Q.add(1234);
    Q.add(1235);
    Q.add(1236);
    Q.add(1237); 
    
    System.out.println("the queue element is :" +Q);
    int num1 = Q.remove();
    System.out.println("the element to be deleted from head is :" +num1);
    System.out.println("the queue after deletion is :" +Q);
    int head = Q.peek();
    System.out.println("the head of queue is :" +head);
    int size = Q.size();
    System.out.println("the size of queue is :" +size);
    }
}