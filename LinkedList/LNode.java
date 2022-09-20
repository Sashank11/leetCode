package LinkedList;

public class LNode {
    int key;
    int val;
    LNode next;
    LNode prev;
    public LNode(int key,int val){
        this.key = key;
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
