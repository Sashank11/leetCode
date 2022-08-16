package LinkedList;
import java.util.*;
public class LLcycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == null || head.next  == null){
            return false;
        }
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
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