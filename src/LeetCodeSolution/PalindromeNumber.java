package LeetCodeSolution;

public class PalindromeNumber {
    
    public static void main(String[] args) {
    
        System.out.println (isPalindrome (121));
    
    
    }
    
    
    public static boolean isPalindrome(int x){
        
        if(x<0 || (x !=0 && x%10 ==0)){
            
            return false;
        }
        
        int reverse =0;
        int num =x;
        while(num>reverse){
            int lastDigit = num%10;
            reverse = reverse *10 + lastDigit;
            num = num/10;
             }
        return num == reverse/10 ||num == reverse;
        }
}