package Trees;
import java.util.*;
public class CountgoodNodes {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
        public int dfs(TreeNode node, int maxval){
            if(node == null){
                return 0;
            }
            int res = 0;
            if(node.val >= maxval){
                res = 1;
            }
            else{
                res = 0;
            }
            maxval = Math.max(maxval, node.val);
            res += dfs(node.left, maxval);
            res += dfs(node.right, maxval);
            return res; 
        }
}
