package LinkedList;

public class CopyRandomPtr {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node curr = head;
        while(curr != null){
        Node newNode = new Node(curr.val);
        map.put(curr,newNode);
        curr = curr.next;
        }
        Node root = new Node(0);
        root.next = map.get(head);
        curr = head;
        while(curr!= null){
            Node newNode = map.get(curr);
            newNode.next = map.get(curr.next);
            newNode.random = map.get(curr.next);

            curr =curr.next;
        }
    
        return root.next;
    }
}
