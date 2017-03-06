
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
public class Solution {
   
    public boolean isPalindrome(int x) {
        System.out.println(x);
        if(x >= 0)
        {
         String reverse = new StringBuilder(x).reverse().toString();
            System.out.println(reverse);
        if (reverse.equals(x))
        {
           return true;
        }
        else
        {
            return false;
        }
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String args[])
    {
        System.out.println("Enter a integer");
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        Solution s = new Solution();
        System.out.println("Result: "+s.isPalindrome(x));
    }
}
