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
public class PascalsTriangle_4 {
    static int factorial(int n)
    {
    int f;
    for(f=1 ; n>1 ;n--)
    {
    f*=n;
    
    }
    return f;
    }
   static int ncr(int n,int r)
   {
   return factorial(n)/factorial(n-r)*factorial(r);
   
   }
public static void main(String[] args)
{
System.out.println();
int n,i,j;
n=5;


for (i=0;i<=n;i++)
{
for (j=0;j<=n-i;j++)
{

System.out.println(" ");
}


for(j=0;j<=i;j++)
{
    System.out.println(" "+ncr(i,j));
}
System.out.println();
}
}
}