package Trees;

public class DiameterofTree {
    int res = -1;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }
        private int dfs(TreeNode current){
            if (current == null){
                return -1;
            }
        int left = 1 + dfs(current.left);
        int right = 1 + dfs(current.right);
        res = Math.max(res, left + right);
        return Math.max(left, right);
        }
}
