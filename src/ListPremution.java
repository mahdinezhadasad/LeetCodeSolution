import java.util.ArrayList;
import java.util.List;

public class ListPremution {
    
    
    public static void main(String[] args) {
        permute(new int[] {1,2,3});
    }
    
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<> ();
        permutation (result, new boolean[nums.length], nums, new ArrayList<> ());
        System.out.println (result);
        return result;
    }
    
    public static void permutation(List<List<Integer>> result, boolean[] used, int[] num, List<Integer> permuation) {
        
        if (permuation.size () == num.length) {
            
            result.add (new ArrayList<> (permuation));
            return;
        }
        
        for (int i = 0; i < num.length; i++) {
            
            if (used[i]) {
                
                continue;
            }
            used[i] = true;
            permuation.add (num[i]);
            permutation (result, used, num, permuation);
            used[i] = false;
            permuation.remove (permuation.size () - 1);
            
        }
        
    }
    
}