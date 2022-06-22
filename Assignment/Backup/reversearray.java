/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream;

/**
 *
 * @author PRIYA
 */

public class reversearray {
    static void reverse_array( int arr[],int start ,int end)
    {
    int temp;
    while(start<end)
    {
        temp=arr[start];
        arr[start]=arr[end];
        start++;
        end--;
        
    }
    }
    static void printArray(int arr[],int size)
    {
    for(int i=0;i<size;i++)
    {
    System.out.println(arr[i] + " ");
    
    }
    System.out.println();
    
    }

    /**
     *
     * @param arg
     */
    public static void main(String arg[])
    {
    int arr[] = {1,2,3,4,6,7};
    printArray(arr,6);
    reverse_array(arr,0,5);
    System.out.println("reverse array is \r");
    reverse_array(arr,0,5);
    printArray(arr,6);
    
    }
    }
            

