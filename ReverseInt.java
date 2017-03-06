
import java.io.BufferedReader;
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
public class ReverseInt {

    public int reverse(int x)  {
        String reverse = "0";
        long num =x;
        while (num != 0) {
            if (num < 0) {
                num = -num;
            }

            long mod = num % 10;
            num = num / 10;
            reverse += mod;
        }
        long result = Long.parseLong(reverse);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
        {
            return 0;
        }
        if (x < 0) {
            return -(int)result;
        } else {
            return (int)result;
        }
    }

    public static void main(String args[])  {
        System.out.println("Please enter an integer");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        ReverseInt r = new ReverseInt();
        System.out.println("Reverse is : " + r.reverse(number));
    }
}
