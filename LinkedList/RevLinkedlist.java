package LinkedList;

public class RevLinkedlist {
    public ListNode reverseList(ListNode head) {
        // ListNode one = new ListNode(3);
        if(head == null){
            return null;
        }
        ListNode curr = head;
        ListNode temp = null;
        ListNode prev = null;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            
        }
        return prev;
    }
}
// if(head == null){
//             return null;
//         }
//         ListNode newHead = head;
//         if(head.next != null){
//             newHead = reverseList(head.next);
//             head.next.next = head;
//         }
//         head.next = null;
//         return newHead;
