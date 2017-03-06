
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pras
 */
public class Factorial {
    
    public static void main (String args[])
    {
        int factorial=1;
        System.out.println("Please enter a number:");
        Scanner in = new Scanner(System.in);
        
        int number = in.nextInt();
        // commented code is for factorial with iteration
       /* while(number>0)
        {
            factorial = factorial*number;
            number--;
        }
        
        System.out.println("Factorial is: "+factorial);*/
        System.out.println("Factorial is: "+factorial1(number));
    }
    //factorial using recursion.
    static int factorial1(int number)
    {
        if (number ==1 ||number ==0)
            return 1;
        else
            return number*factorial1(number-1);
    }
}
