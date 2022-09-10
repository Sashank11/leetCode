package LinkedList;

public class RemoveNfromend {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
                ListNode root = new ListNode(0);
        root.next = head;
        ListNode left = root;
        ListNode right = head;
        int toll = n;
        
        while(toll > 0 && right != null){
            right = right.next;
            toll--;
        }
        while(right != null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return root.next;
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
        System.out.println(removeNthFromEnd(head, 2));
        System.out.println(head.val);
    }
}
// revise above