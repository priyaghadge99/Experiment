
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRIYA
 */
public class specificindex {
    public static void main(String[] args)
    {
    int[] my_array={25,14,56,15,36,56,77,18,29,49};
    System.out.println("original array : " +Arrays.toString(my_array));
    int remo = 3;
    
    for(int i= remo;i<my_array.length-1;i++)
    {
    my_array[i] = my_array[i+1];
    
    }
    System.out.println("after removing the 2nd element from string: " +Arrays.toString(my_array));
    
    }
    
}
