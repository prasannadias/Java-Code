/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pras
 */
public class FizzBuzz {
    
    public static void main(String args[])
    {
        for(int i =1; i<=50; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("Number:"+"FizzBuzz");
            }
            else if(i%3==0)
            {
                  System.out.println("Number:"+"Fizz");
            }
            else if(i%5==0)
            {
                  System.out.println("Number:"+"Buzz");
            }
            else
            {
            System.out.println("Number:"+i);
            }
        }
    }
    
}
