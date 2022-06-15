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

public class missing_number2 
{
  static int findMissingNo(int a[] ,int n)
 {
 int i, total;
 total = (n + 1) * (n + 2) / 2;
 for (i = 0; i < n; i++)
 total -= a[i];
 return total;
 } 

 /* program to test above function */
 public static void main(String args[])
 {
 int [] arr = { 1, 2, 4, 5, 6 ,8};
 int miss = findMissingNo(arr,6);
 System.out.println(miss);
 System.out.println(findMissingNo(arr, arr.length));
 System.out.println( arr.length);
 }
}
 /* program just finding number of missing  
 here just 3 and 7 are missing 
 
*/ 