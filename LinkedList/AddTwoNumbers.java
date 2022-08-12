package LinkedList;
import java.util.*;
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> vals = new ArrayList<>();
        int rem = 0;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while(temp1 != null || temp2 != null){
            int sum = temp1.val + temp2.val;
            if(sum >= 10){
                int dig = sum % 10;
                vals.add(dig);
                rem = 1;
            }
            else{
            sum = temp1.val + temp2.val + rem;
            if(sum >= 10){
                int dig = sum % 10;
                vals.add(dig);
                rem = 1;
            }
            else{
                vals.add(sum);
            }
            rem = 0;
            temp1 = temp1.next;
            temp2 = temp2.next;
            }
            
        }
        temp1 = l1;
        temp2 = l2;
        
        while(temp1 != null || temp2 != null){
            
        }
    }
}
