import java.util.LinkedList;

public class palindrome {
    
    public static void main(String[] args) {
    
        System.out.println (checkForPalindrome ("abcaba"));
        System.out.println (checkForPalindrome ("Was it a car or a cat I saw"));
    
    
    }
    
    public static boolean checkForPalindrome(String string){
    
        LinkedList<Character> stack = new LinkedList<Character> ();
        
        StringBuilder stringNoPunctuation = new StringBuilder (string.length ());
       String lowerCase = string.toLowerCase ();
       for(int i=0; i < lowerCase.length (); i++){
           
           char  c = lowerCase.charAt (i);
           if(c>='a' && c<= 'z'){
    
               stringNoPunctuation.append (c);
               stack.push (c);
           }
       }
       
       StringBuilder reveredString = new StringBuilder (stack.size ());
       
       while(!stack.isEmpty ()){
           
           reveredString.append (stack.pop ());
           
       }
        return reveredString.toString ().equals (stringNoPunctuation.toString ());
        
    }
}