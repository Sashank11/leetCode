package LinkedList;

public class ReorderLL {
    public static void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
}
        ListNode revList = slow.next;
        ListNode prev = slow.next = null;
        while(revList !=null){
            ListNode temp = revList.next;
            revList.next = prev;
            prev = revList;
            revList = temp;
        }
        
        ListNode curr = head;
        revList = prev;
        while(revList != null){
            ListNode temp1 = curr.next;
            ListNode temp2 = revList.next;
            curr.next = revList;
            revList.next = temp1;
            revList = temp2;
            curr = temp1;
            
        }
       
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode l1  = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;
        reorderList(head);

    }
}
