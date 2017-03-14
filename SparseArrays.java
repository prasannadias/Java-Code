
import java.util.Arrays;
import java.util.HashMap;
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
/*There are  strings. Each string's length is no more than  characters. There are also  queries. For each query, you are given a string, and you need to find out how many times this string occurred previously.

Input Format

The first line contains , the number of strings.
The next  lines each contain a string.
The nd line contains , the number of queries.
The following  lines each contain a query string.

Sample Input

4
aba
baba
aba
xzxb
3
aba
xzxb
ab
Sample Output

2
1
0*/
public class SparseArrays {
    
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strings=new String[n] ;
       
        
        for (int i=0;i<n; i++)
        {
           
            strings[i]= in.next();
          }
        int q=in.nextInt();
        String[] queries=new String[q];
        for (int j=0;j<q;j++)
        {
            queries[j]=in.next();
        }
        HashMap<String,Integer> result= new HashMap<String,Integer>();
        
        for(int k=0;k<n;k++)
        {
            if(result.containsKey(strings[k]))
       
            {
                result.put(strings[k],result.get(strings[k])+1);
            }
            else
            {
                result.put(strings[k], 1);
            }
        }
        for(int m=0; m<q; m++)
        {
            if (result.containsKey(queries[m]))
            {
                System.out.println(result.get(queries[m]));
            }
            else
            {
                System.out.println("0");
            }
        }
        
    
}
}
