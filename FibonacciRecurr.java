/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pras
 */
public class FibonacciRecurr {
   // static int i=1,j=1,n=1;
    public static void main(String args[])
    {
        int num =10;
        //System.out.println(i);
       // System.out.println(j);
        for (int i=1;i<=num;i++)
        {
         System.out.println(fibonacci(i)+" ");
        }
    }
    
    public static int fibonacci(int num)
    {
      if (num==1 || num==2)
      {
          return 1;
      }
      
          return fibonacci(num-1)+fibonacci(num-2);
        
    }
}
