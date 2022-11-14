import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequentElements {

    public static void main(String[] args) {

        topKFrequent(new int[]{1, 1, 1, 2, 2,2, 3,3,3,3},2);

    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println("HashMap: "
                + map.toString());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int key : map.keySet()){
            if(pq.size() == k ){
                if(map.get(key) > map.get(pq.peek())){
                    pq.remove();
                    pq.offer(key);
                }
            }else{
                pq.offer(key);
            }
        }
        int j = 0;
        int[] res = new int[k];
        while(!pq.isEmpty()){
            res[j] = pq.remove();
            j++;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }


    public static int[] topKFrequencyRepeating(int[] nums, int k){

        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){

            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int key: map.keySet()){

            if(pq.size()== k){

                if(map.get(key)> map.get(pq.peek())){

                    pq.remove();
                    pq.offer(key);
                }}
            else{
                pq.offer(key);
            }

        }
        int j =0;
        int[] res = new int[k];
        while(!pq.isEmpty()){

            res[j] = pq.remove();
            j++;
        }

        System.out.println(Arrays.toString(res));

        return res;


    }
}