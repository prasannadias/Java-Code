/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pras
 */
public class twoSum {
    
    public int[] twoSum(int[] nums, int target)
    {
        int[] found = {-1,-1};
        int sum =0;
        int length = nums.length;
        System.out.println("length"+length);
        for(int i=0; i<length; i++)
        {
            for (int j=0; j<length;j++)
            
        {
            if(i==j)
            {
                break;
            }else
            {
            sum =nums[i]+nums[j];
            if (sum == target)
            {
                found[0]=i;
                found[1]=j;
                System.out.println("Numbers found");
                //return new int[]{i,j}; //Can be returned this way
                return found;
            }
            }
                   
    }
    }
        return found; //here we can do throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String args[])
    {
        twoSum ts = new twoSum();
        int[] in= {3,2,4};
        int[] out= ts.twoSum(in, 6);
        System.out.println("Indices are: "+out[0]+" "+out[1]);
    }
    
}


/*
//Solution using hashtable
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            return new int[] { i, map.get(complement) };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
*/