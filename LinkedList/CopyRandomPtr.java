package LinkedList;
import java.util.*;
public class CopyRandomPtr {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        map.put(null,null);
        Node curr = head;
        while(curr != null){
        Node newNode = new Node(curr.val);
        map.put(curr,newNode);
        curr = curr.next;
        }
        curr = head;
        while(curr!= null){
            Node newNode = map.get(curr);
            newNode.next = map.get(curr.next);
            newNode.random = map.get(curr.random);
            curr =curr.next;
        }
    
        return map.get(head);
    }
}
