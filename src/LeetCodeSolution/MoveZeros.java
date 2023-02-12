package LeetCodeSolution;

import java.util.LinkedList;
import java.util.Queue;

public class MoveZeros {
    
    public void moveZeros(int[] nums) {
        
        if (nums.length == 1) return;
        
        Queue<Integer> queue = new LinkedList<> ();
        
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] != 0) {
                
                queue.add (nums[i]);
            }
            
        }
        
        int index = 0;
        
        while (queue.size () != 0) {
            
            nums[index] = queue.poll ();
            index++;
            
        }
        
        for (int i = index; i < nums.length; i++) {
            
            nums[i] = 0;
        }
        
    }
    
    
    public void moveZeros2(int[] nums) {
        
        if (nums.length == 1) return;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                
                nums[left] = nums[right];
                left++;
            }
            
        }
        for (int i = left; i < nums.length; i++) {
            
            nums[i] = 0;
        }
        
        
    }
}