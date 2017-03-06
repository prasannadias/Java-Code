/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pras
 */
public class staticMethod {
     int a = 20;
     int rollno;  
     String name;  
     static String college = "ITS";  
       
     static void change(){  
     college = "BBDIT";  
     }  
  
     staticMethod(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
  
    public static void main(String args[]){  
  
    staticMethod s1 = new staticMethod (111,"Karan");  
    staticMethod s2 = new staticMethod (222,"Aryan");
    s1.display();  
    s2.display();  
   
    staticMethod.change();  
    
    staticMethod s3 = new staticMethod (333,"Sonoo");  
    s3.display();  
    }  
}  
    
