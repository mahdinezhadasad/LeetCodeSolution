package LeetCodeSolution;

import java.util.Stack;

public class LongValidParentheses {
    
    public static void main(String[] args) {
    
    
    }
    
    public static int longestValidParent(String s) {
        
        int ans = 0;
        
        Stack<Integer> stack = new Stack<> ();
        stack.push (-1);
        
        for (int i = 0; i < s.length (); i++) {
            
            char ch = s.charAt (i);
            if (ch == '(') {
                stack.push (i);
                
            } else {
                
                stack.pop ();
                if (stack.size () == 0) {
                    
                    stack.push (i);
                } else {
                    
                    ans = Math.max (ans, i - stack.peek ());
                }
                
                
            }
        }
        
        return ans;
    }
}