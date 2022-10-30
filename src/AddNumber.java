public class AddNumber {
    
    public static void main(String[] args) {
        
        
        addTwoNumberEqual(new int[]{3, 4, 5, 1, -1, 6, 7, 8, 2});
        
    }
    
    
    public static void addTwoNumberEqual(int [] s){
        
        int m = s.length;
        for(int i=0; i<m; i++){
            for(int j =1; j<m; j++){
               boolean isSumisSeven = s[i] + s[j] == 7;
               if(isSumisSeven){
                   StringBuilder stringBuilder = new StringBuilder ();
    
                   System.out.println ("("+ s[i] +"," + s[j]  );
                   
               }
               
            }
            
            
        }
        
        
        
    }
}