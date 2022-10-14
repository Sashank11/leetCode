package Trees;
import java.util.*;
// my solution
public class Kthsmall {
    public int kthSmallest(TreeNode root, int k) {
        int count = 0;
        TreeNode curr = root;
        Stack<TreeNode> s = new Stack<>();
        while(curr != null || !(s.isEmpty())){
            while(curr != null){
                s.add(curr);
                curr = curr.left;
            }
            curr = s.pop();
            count +=1;
            if(count == k){
                return curr.val;
            }
            curr = curr.right;

        }
        return -1;
    }
}
// standard inorder travers
// public int kthSmallest(TreeNode root, int k) {
//         List<Integer> list = new ArrayList<>();
//         inorder(root, list);
//         return list.get(k - 1);
//     }

//     private void inorder(TreeNode root, List<Integer> list) {
//         if (root == null) return;

//         inorder(root.left, list);
//         list.add(root.val);
//         inorder(root.right, list);
//     }