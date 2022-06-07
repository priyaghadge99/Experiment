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
public class attendence {
    public static void main(String[] args)
    {
    Scanner SC = new Scanner(System.in);
    System.out.println("no of classes held:");
    int x = SC.nextInt();
    System.out.println("no of classes attend:");
    int y= SC.nextInt();
    
    float pf ;
    pf=(y*100)/x;
     System.out.println(pf);
     if(pf>75)
         System.out.println("eligible for exam : " +pf);
    else
    System.out.println("not eligible for exam : " +pf);
    }
    
}
