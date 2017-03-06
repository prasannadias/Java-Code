
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
public class Amstrong {

    public static void main(String args[]) {
        int i2 = 0;
        System.out.println("Please enter a number");
        Scanner in = new Scanner(System.in);
        int in1 = in.nextInt();
        int in2=in1;
        int a=in1, i;

        while (a != 0) {
            a = in1 / 10;
            i = in1 % 10;
            in1 = a;
            i2 += i * i * i;
        }
        System.out.println("Value is:"+i2);
        
        if(in2 == i2 )
        {
            System.out.println("Number is Amstrong");
        }
        else
        {
            System.out.println("Number is not Amstrong");
        }
    }

}
