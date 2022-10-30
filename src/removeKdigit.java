import java.util.Stack;

public class removeKdigit {
    
    public static void main(String[] args) {
        removeKdigits("20100",1);
    
    }
    
    public static String removeKdigits(String num, int k) {
        
        Stack<Character> stack = new Stack<> ();
        int n = num.length ();
        if (n == k) {
            
            return "0";
        }
        int count = 0;
        Character s = null;
        while (count < n) {
            
            if(!stack.isEmpty ()){
                 s = stack.peek ();
            }
            
            char m = num.charAt (count);
            while (k > 0 && !stack.isEmpty () && s > m) {
                stack.pop ();
                k--;
            }
            stack.push (num.charAt (count));
            count++;
            
        }
        while (k > 0) {
            stack.pop ();
            k--;
        }
        StringBuilder sb = new StringBuilder ();
        while (!stack.isEmpty ()) {
            sb.append (stack.pop ());
        }
        sb.reverse ();
        while (sb.length () > 1 && sb.charAt (0) == '0') {
            sb.deleteCharAt (0);
        }
        System.out.println (sb.toString ());
        return sb.toString ();
        
    }
}