package LinkedList;

public class LLcycle {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        List<ListNode> lvals = new ArrayList<>();
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
// ListNode curr = head;
//         List<ListNode> lvals = new ArrayList<>();
//         while(curr != null){
//             if(lvals.contains(curr)){
//                 return true;
//             }
//             lvals.add(curr);
//             curr = curr.next;
            
//         }
//         return false;