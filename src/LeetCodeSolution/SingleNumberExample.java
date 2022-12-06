package LeetCodeSolution;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberExample {
    
    public static void main(String[] args) {
        
        int[] m = {2, 2, 1};
        
        System.out.println (singleNumberExample (m));
        System.out.println (xorXingleNumber (m));
    }
    
    public static int singleNumberExample(int[] nums) {
        
        if (nums.length == 1) {
            
            return nums[0];
        }
        
        Set<Integer> set = new HashSet<Integer> ();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains (nums[i])) {
                set.remove (nums[i]);
            } else {
                set.add (nums[i]);
            }
        }
        return set.iterator ().next ();
        
    }
    
    public static int xorXingleNumber(int[] nums) {
        
        int ans = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            
            ans = ans ^ nums[i];
        }
        
        return ans;
    }
}