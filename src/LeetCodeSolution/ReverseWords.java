package LeetCodeSolution;

public class ReverseWords {
    
    public static void main(String[] args) {
    
        System.out.println (reverseWords ("mahmut nereye   gitti"));
    }
    
    public static String reverseWords(String s){
        
        
        
        
        
        char[]  str = s.toCharArray();
        reverse(str, 0,str.length -1);
        char[] m = reverseWords (str);
        char[] f = m;
        String abs  = cleanSpaces (m);
        
        return abs;
        
    }
    
    
    private static String cleanSpaces(char[] str) {
        
        int left = 0;
        int right = 0;
        
        while (right < str.length) {
            
            while (right < str.length && str[right] == ' ') {
                right++;
            }
            while (right < str.length && str[right] != ' ') {
                
                str[left] = str[right];
                left++;
                right++;
            }
            while (right < str.length && str[right] == ' ') {
                right++;
            }
            if (right < str.length) {
                
                str[left] = ' ';
                left++;
            }
            
            
        }
        String s = new String (str).substring (0, left);
        return s;
    }
    
    private static char[] reverseWords(char[] str){
        
        int  left = 0;
        int right = 0;
        while (left < str.length){
            
            while(left < str.length && str[left] == ' ') left++;
            right = left;
            while(right < str.length && str[right] != ' ') right++;
            reverse (str,left,right -1);
            left = right;
        }
    
        return str;
    }
    
    private static void reverse(char[] str, int left, int right) {
        
        
        while(left<right){
            
            
            char tmp = str[left];
            str[left] = str[right];
            str[right] = tmp;
            left++;
            right--;
            
            
        }
    }
}