
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
public class Prime {
    
    public static void main(String args[])
    {
        int flag = 0;
        System.out.println("Please enter a number: ");
        
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        
        for (int i=2;i<number;i++)
        {
            if (number%i==0)
            {
                flag =1;
                System.out.println("Not a prime number: "+number);
                break;
            }
            
        }
       
        if(flag ==0)
        {
             System.out.println("Prime number : "+number);
        }
        
    }
    
}
