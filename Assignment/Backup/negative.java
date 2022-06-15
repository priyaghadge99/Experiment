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
public class negative {
    static void shiftall(int a[],int left ,int right){
        while(left<right){
        if(a[right]>=0 || a[left]>=0)
            
            {
                int temp = a[left];
                a[left]= a[right];
                left++;
                right--;
            }
            else if(a[left]<=0||a[right]<=0)
            {
                left++;
                right++;
            }
            
            else{
                right--;
            }
        else
        {
            left++;
        }
    static void display(int a[],int right)
    {
        for (int i=0;i<=right;++i)
        {
        System.out.println(a[i]+"");
        
        }
        System.out.println();
        }
        }
    }
public static void main(String arg[])
    
{
        int a[] ={-12,1,-2,34,5,7,-3};
        int arr_size= a.lenth;
        shiftall(a,0,arr_size-1);
        display(a,arr_size-1);

    }
    
    
}
