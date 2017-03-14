
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
public class ArraySum {
    
    static long summation(int[]numbers){
          int length = numbers.length;
        long sum=0;
        for (int i=0;i<length;i++)
            {
              sum = sum+numbers[i];
        }
        return sum;
        
    }
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        System.out.println("Sum is :"+summation(arr));
                
    }
}
