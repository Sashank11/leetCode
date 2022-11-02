package heap_pri;
import java.util.*;
public class LastStoneweight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int stone : stones) heap.add(-stone);
        while(heap.size() > 1){
            int first = heap.remove();
            int second = heap.remove();
            if(first != second){
                heap.add(first - second);
            }
        }
        return heap.size() != 0 ? Math.abs(heap.remove()) : 0; 
    }
}
