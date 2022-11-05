import java.util.Arrays;

public class countingSort {
    public static void main(String[] args) {
        
        int[] intArray = {2,5,9,8,22,7,10,4,3};
    
        countingSortMethod (intArray,1,22);
    
       // System.out.println (Arrays.toString (intArray));
        
    
    
    }
    
    public static void countingSortMethod(int[] input, int min,int max){
        
        int[] countArray = new int[(max -min) +1];
    
        for (int i = 0; i < input.length; i++) {
        
            System.out.println (input[i] - min);
            countArray[input[i] - min]++;
        }
    
        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        
        }
    
    
    }
    
    public static  void countingoneThing(int[] input, int min,int max){
        
        int[] oneThingTryToDo = new int[(max-min)+1];
        
        for(int i =0; i<input.length; i++){
            
            oneThingTryToDo[input[i] -min]++;
        }
        
        int j =0;
        
        for(int i =min; i<=max; i++){
            
            while(oneThingTryToDo[i-min]>0){
                
                input[j++]=i;
                oneThingTryToDo[i-min]--;
            }
        }
        
        
        
    }
}