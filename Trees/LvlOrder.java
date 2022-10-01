package Trees;
import java.util.*;
public class LvlOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return res;
        }
        q.add(root);
        while(!q.isEmpty()){
            int q_len = q.size();
            List<Integer> lvl = new ArrayList<>();
            for(int i = 0; i< q_len; i++){
                TreeNode curr = q.poll();
                lvl.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }

            }
            res.add(lvl);
        }
        return res;

    }
}
