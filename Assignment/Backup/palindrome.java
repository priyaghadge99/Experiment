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
public class palindrome {
   
    public static void main(String[] args)
    {
    int num =1221,reversed=0;
    int temp = 1221,digit;
    num = temp;
    while(num> 0)
    {
    digit = num % 10;
    reversed =(reversed * 10)+digit;
    num=num/10;
     }
   
    
    if(temp == reversed)
    System.out.println( num+" is a palindrome.");
    else
    System.out.println( num+"is not a palindrome .");
    

}
}