/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pras
 */
public class Fibonacci {
    
    public static void main(String args[])
    {
        int n=1;
        int i = 1,j=1;
        System.out.println(i);
        System.out.println(j);
        
        while (n<=100)
        {
                      
           n =j+i;
           System.out.println(n);
           j=i;
           i=n;
        }
    }
    
}
