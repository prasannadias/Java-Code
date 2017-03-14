
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
public class stairCase {
    
    static void StairCase(int n)
    {   
       
        for (int i=1;i<=n;i++)
        {
           for(int k=n-1;k>=i;k--)
            System.out.print(" ");
           
            for(int j=1;j<=i;j++)
            {
               
                System.out.print("*");
                
            }
          System.out.println("");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of steps");
        int number = sc.nextInt();
        StairCase(number);
    }
}
