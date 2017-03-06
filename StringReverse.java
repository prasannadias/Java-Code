
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
public class StringReverse {
    public static void main(String args[])
    {
       // StringBuilder str = new StringBuilder();
        String reverse ="";
        System.out.println("Please enter a string: ");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        System.out.println("You entered: "+s1);
        int len = s1.length();
        char a[]= s1.toCharArray();
        
        for (int i=len-1;i>=0;i--)
        {
            //System.out.print(a[i]);
            //str.append(a[i]); //instead of printing individual characters 
            //append each char to stringbuilder then print the reversed string --way1
            reverse = reverse+a[i];//way2
        }
        System.out.println("Reversed String:"+reverse);
    }
}
