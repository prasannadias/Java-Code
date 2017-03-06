
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
public class CheckPalindrome {
    
    
    public static void main (String args[])
    {
       // StringBuilder str = new StringBuilder();
       // StringBuilder str1 = new StringBuilder();
        System.out.println("Please enter a string");
        Scanner in = new Scanner(System.in);
        String in1 = in.nextLine().trim();
        
     
        String reverse = new StringBuilder(in1).reverse().toString();
        //str.append(in1);
        //String reverse=str.reverse().toString();
        System.out.println("Original string is:"+in1);
        System.out.println("Reversed string is:"+reverse);
        if (reverse.equals(in1))
        {
            System.out.println(in1 +" is Palindrome");
        }
        else
        {
            System.out.println(in1 +" is not a Palindrome");
        }
        
    }
    
}
