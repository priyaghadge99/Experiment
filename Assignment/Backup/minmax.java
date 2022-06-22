/* problem statement :- maximum and minimum of an array using minimum number of comparison



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.*;
package com.mycompany.dream;
   
/**
 *
 * @author PRIYA*/
public class minmax{
      public Static void main(String args[])
        {
            int  arr[]={1,5,7,89,9};
            int arr_size=5;
            pair minmax = null;
            getminmax(arr,arr_size);
            System.out.println(minmax.min);


        }    




        static class pair{
            int min;
            int max;
        }
        static pair getminmax(int arr[],int n)
        {
            pair minmax = new pair();
            int i;
            if(n==1){
                minmax.min=arr[0];
                minmax.max=arr[0];
                return minmax;
            }
            if(arr[0]>arr[1])
            {
                minmax.min=arr[1];
                minmax.max=arr[0];
            }
            else{
                minmax.min=arr[0];
                minmax.max=arr[1];
            }

            for( i=2;i<n;i++)
            {
                if(arr[i]>minmax.max){
                    minmax.max=arr[i];
                }else if(arr[i]<minmax.min){
                    minmax.min=arr[i];
                }
                /* return minmax;  */
            }
        
        }
         
    
}
