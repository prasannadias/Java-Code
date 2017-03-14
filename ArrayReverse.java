
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
public class ArrayReverse {
    static void reverseArray(int[] arr)
    {
        for(int i=arr.length-1; i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
        arr[arr_i] = in.nextInt();
         }
        reverseArray(arr);
    }
}
