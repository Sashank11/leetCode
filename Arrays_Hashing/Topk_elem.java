package Arrays_Hashing;
import java.util.*;
public class Topk_elem {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for( int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = 
        new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(Map.Entry entry : map.entrySet()){
            pq.add(entry);
        }
        int[] output = new int[k];
        for(int i = 0; i<k; i++){
            output[i] = pq.poll().getKey();
        }
        return output;
    }
}


// HashMap<Integer, Integer> map = new HashMap<>();
//         int[] out = new int[k];
//         int count = 0;
//         for(int i : nums){
//             if(!map.containsKey(i)){
//                 map.put(i, count + 1);
//             }
//             map.get(i).add(count + 1);

//         }
// // now sort map
//     for(int i = 0; i<k; i++){
//         out[i] = map.get(i);
//     }