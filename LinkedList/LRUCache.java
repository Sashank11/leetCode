import java.util.*;

class LRUCache {
    private Map<Integer, LNode> cache;
    private int capacity;
    private LNode left;
    private LNode right;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        
        this.left = new LNode(0,0);
        this.right = new LNode(0,0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
            insert(cache.get(key));
            return cache.get(key).val;
        }
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        cache.put(key, new LNode(key, value));
        insert(cache.get(key));
        if(cache.size() > capacity){
            LNode lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
    
    public void remove(LNode node){
        LNode prev = node.prev;
        LNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    public void insert(LNode node){
        LNode prev = this.right.prev;
        LNode next = this.right;
        
        prev.next = node;
        next.prev = node;
        node.next = next;
        node.prev = prev;
    }
}