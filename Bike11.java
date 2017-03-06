/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pras
 */

    class Bike11{  
  int cube(final int n){  
   //n=n+2;//can't be changed as n is final  ---compile time error
  return  n*n*n;  
  }  
  public static void main(String args[]){  
    Bike11 b=new Bike11();  
    System.out.println(b.cube(5));  
 }  
}  

