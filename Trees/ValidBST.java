package Trees;
import java.util.*;
public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return  dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);

    }
    public boolean dfs(TreeNode node, long left, long right){
        if(node == null){
            return true;
        }
        if(!(node.val < right && node.val > left)){
            return false;
        }
        return dfs(node.left, left, node.val) && dfs(node.right,node.val, right);
    }
}
// 62 cases
// if(root == null){
//             return true;
//         }
//         if(root.left == null && root.right == null){
//             return true;
//         }
//         if(root.left == null){
//             if((root.val < root.right.val)){
//             return true;
//             }
//             else{
//                 return false;
//             }
//         }
//         if(root.right == null){
//             if((root.val > root.left.val)){
//             return true;
//             }
//             else{
//                 return false;
//             }
//         }
//         if(!(root.val > root.left.val && root.val < root.right.val)){
//             return false;
//         }
//         return isValidBST(root.left) && isValidBST(root.right);