
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
public class EvenorOdd {
    
    public static void main(String args[])
    {
        System.out.println("Please enter a number: ");
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        
        if (number%2==0)
            System.out.println(number+" is an even number");
        else
            System.out.println(number+" is an odd number");
        
        
    }
    
}
