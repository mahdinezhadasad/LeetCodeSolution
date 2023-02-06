package LeetCodeSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    
    public static void main(String[] args) {
    
        System.out.println (groupAnagrams (new String[]{"eat", "tea","mahmut","mutmah","ate","tree","eert"}));
    }
    
    public static List<List<String>>  groupAnagrams(String[]  strs){
    
        Map<String,List<String>>  map = new HashMap<> ();
        
        for(String word : strs){
            
            char[] ca = word.toCharArray();
            Arrays.sort(ca);
            String str  =  new String(ca);
            
            if(!map.containsKey (str)){
                
                map.put (str,new ArrayList<> ());
            }
            
            map.get(str).add (word);
        }
        return new ArrayList<> (map.values ());
    }
}