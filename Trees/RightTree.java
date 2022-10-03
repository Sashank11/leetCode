package Trees;
import java.util.*;
public class RightTree {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return res;
        }
        q.add(root);
        while(!q.isEmpty()){
            TreeNode rightside = null;
            int q_len =   q.size();
            for(int i = 0; i< q_len; i++){
                TreeNode node = q.poll();
                if(node != null){
                    rightside = node;
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(rightside != null){
                res.add(rightside.val);
            }
        }
        return res;
    }
}
