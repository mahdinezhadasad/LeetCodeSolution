package LeetCodeSolution;

import java.util.Stack;

public class DecodeString {
    
    public static void main(String[] args) {
    
    
        System.out.println (decodeString ("3[a]2[bc]"));
    
    }
    
    public static String decodeString(String str) {
        
        Stack<Integer> numStack = new Stack<> ();
        
        Stack<String> strStack = new Stack<> ();
        
        StringBuilder sb = new StringBuilder ();
        int len = str.length ();
        for (int i = 0; i < len; i++) {
            
            char ch = str.charAt (i);
            
            if (Character.isDigit (ch)) {
                
                int num = ch - '0';
                
                while (i + 1 < len && Character.isDigit (str.charAt (i + 1))) {
                    num = num * 10 + str.charAt (i + 1) - '0';
                    i++;
                }
                
                numStack.push (num);
            } else if (ch == '[') {
                strStack.push (sb.toString ());
                sb = new StringBuilder ();
            } else if (ch == ']') {
                
                int k = numStack.pop ();
                StringBuilder tmp = new StringBuilder (strStack.pop ());
                for (int j = 0; j < k; j++) {
                    
                    tmp.append (sb);
                }
                
                sb = tmp;
            } else {
                
                sb.append (ch);
            }
            
            
        }
        
        return sb.toString ();
    }
    
}