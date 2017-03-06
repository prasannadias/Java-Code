
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
public class ReverseIntegerLeetCode {
    
    public static void main(String args[])
    {
    System.out.println("Enter an integer");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    ReverseIntegerLeetCode r = new ReverseIntegerLeetCode();
    
    System.out.println(r.reverse(num));
    
        
        
       
    }
    
    public int reverse(int num)
    {
        StringBuffer str=new StringBuffer();
        StringBuffer reverse=new StringBuffer();
        long result =0;
        if(num >= 0)
        {
             str =str.append(Integer.toString(num));
             
        }
        else
        {
            str = str.append((Integer.toString(num)).substring(1));
            
        }
        System.out.println(str);
        reverse =str.reverse();
        result= Long.parseLong(reverse.toString());
        
         if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
        {
            return 0;
        }
        if (num < 0) {
            return -(int)result;
        } else {
            return (int)result;
        }
    }
    
}
