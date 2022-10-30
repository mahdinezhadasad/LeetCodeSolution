import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args) {
        
        int[] intArray = {20,35,-15,7,55,1,-22};
        
        for(int lastunsortedIndex = intArray.length-1; lastunsortedIndex>0;lastunsortedIndex--){
            int largest =0;
            for(int i=1; i<=lastunsortedIndex;i++){
                
                if(intArray[i]>intArray[largest]){
                    
                    largest=i;
                }
            }
            swap (intArray,largest,lastunsortedIndex);
    
            System.out.println (Arrays.toString (intArray));
        }
    
    
    }
    
    public static void swap(int[] array, int i, int j) {
        
        if (i == j) {
            
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    
}