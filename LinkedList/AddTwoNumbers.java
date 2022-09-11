package LinkedList;
import java.util.*;
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode curr = root;
        int carry = 0;
        int v1 = 0;
        int v2 = 0;
        while(l1 != null || l2 != null || carry != 0){
            if (l1 != null)
                v1 = l1.val;
            else 
                v1 = 0;
            if (l2 != null)
                v2 = l2.val;
            else 
                v2 = 0;
            int val = v1 + v2 + carry;
            carry = val / 10;
            val = val % 10;
            curr.next = new ListNode(val);
            
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            else
                l1 = null;
            if (l2 != null)
                l2 = l2.next;
            else
                l2 = null;
        }
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
        // l2.next = l3;
        l3.next = l4;
        // l4.next = l5;
        // l5.next = null;
        System.out.print(addTwoNumbers(l1, l3).next.val);
        // System.out.println(.val);
    }
}
// TLE
//  List<Integer> vals = new ArrayList<>();
    //     int rem = 0;
    //     ListNode temp1 = l1;
    //     ListNode temp2 = l2;
    //     while(temp1 != null || temp2 != null){
    //         int sum = temp1.val + temp2.val;
    //         if(sum >= 10){
    //             int dig = sum % 10;
    //             vals.add(dig);
    //             rem = 1;
    //         }
    //         else{
    //         sum = temp1.val + temp2.val + rem;
    //         if(sum >= 10){
    //             int dig = sum % 10;
    //             vals.add(dig);
    //             rem = 1;
    //         }
    //         else{
    //             vals.add(sum);
    //         }
    //         rem = 0;
    //         temp1 = temp1.next;
    //         temp2 = temp2.next;
    //         }
            
    //     }
    //     temp1 = l1;
    //     temp2 = l2;
    //     ListNode root = new ListNode(0);
    //     ListNode prev = new ListNode(0);
    //     root.next = prev;
    //     int i = 0;
    //     while(temp1 != null || temp2 != null){
    //         ListNode newNode = new ListNode(vals.get(i));
    //         prev.next = newNode;
    //         prev = newNode;
    //         temp1 = temp1.next;
    //         temp2 = temp2.next;
    //         i++;
    //     }
    //     return root.next.next;
    // }

    // revised
    
    // ListNode dummy = new ListNode(0);
    //     ListNode curr = dummy;
    //     dummy.next = curr;
    //     int carry = 0;
    //     int v1, v2;
    //     while(l1 != null || l2 != null || carry != 0){
    //         if(l1 != null){
                
    //             v1 = l1.val;
    //             }
    //         else{
    //             v1 = 0;
    //         }
            
    //         if(l2 != null){
                
    //             v2 = l2.val;
    //             }
    //         else{
    //             v2 = 0;
    //         }
    //         int sum = v1 + v2 + carry;
    //         carry = sum / 10;
    //         sum = sum % 10;
    //         curr.next = new ListNode(sum);
    //         curr = curr.next;
    //         if(l1 != null){
    //         l1 = l1.next;
    //         }
    //         if(l2 != null){
    //         l2 = l2.next;
    //         }
    //     }
    //     return dummy.next;