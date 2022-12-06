package LeetCodeSolution;

public class ReverseInteger {
    public static void main(String[] args) {
    
        System.out.println ( reverseInteger (9239));
    
    
    }
    
    public static int reverseInteger(int x) {
        
        int reverseInt = 0;
        
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        
        while (x != 0) {
            
            int lastDigit = x % 10;
            if ((reverseInt > max / 10) || (reverseInt == max / 10 && lastDigit > 7)) {
                
                return 0;
            }
            if (reverseInt < min / 10 || (reverseInt == min / 10 && lastDigit < -8)) {
                
                return 0;
            }
            reverseInt = reverseInt * 10 + lastDigit;
            x = x / 10;
        }
        
        return reverseInt;
        
    }
}