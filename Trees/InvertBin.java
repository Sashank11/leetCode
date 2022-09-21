package Trees;
public class InvertBin {
    public TreeNode invertTree(TreeNode root) {
        TreeNode curr = root;
        TreeNode temp = new TreeNode();
        if(curr == null){
            return null;
        }
        temp = curr.left;
        curr.left = curr.right;
        curr.right = temp;
        invertTree(curr.left);
        invertTree(curr.right);
        return curr;
    }
}
