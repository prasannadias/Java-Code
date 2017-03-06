/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pras
 */
public class SplitString {
    
    
    public static void main (String args[])
    {
        String s1 = "This is a testings string.";
        //String str []= s1.split("\\s"); //\s is whitespace and since we are using special character have to use escape so \\s
        for(String str:s1.split(" "))
       // for (String s:str)
            System.out.println(str);
    }
    
}
