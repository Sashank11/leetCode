package LinkedList;
import java.util.*;
public class LLcycle {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        HashSet<ListNode> lvals = new HashSet<>();
        while(curr != null){
            if(lvals.contains(curr)){
                return true;
            }
            lvals.add(curr);
            curr = curr.next;
            
        }
        return false;
        
    }
}
// Not so efficient
// public boolean hasCycle(ListNode head) {
//         ListNode curr = head;
//         HashSet<ListNode> lvals = new HashSet<>();
//         while(curr != null){
//             if(lvals.contains(curr)){
//                 return true;
//             }
//             lvals.add(curr);
//             curr = curr.next;
            
//         }
//         return false;
        
//     }