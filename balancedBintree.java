class Solution {
    public int traversal(TreeNode root) {

        if(root == null){
            return 0;
        }

        int leftHeight = traversal(root.left);
        if(leftHeight == -1){
            return -1;
        }
        int rightHeight = traversal(root.right);
        if(rightHeight == -1){
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1){
            return-1;
        }
        return Math.max(leftHeight, rightHeight)+1;
    }
    public boolean isBalanced(TreeNode root){
        return traversal(root) != -1;
    }
}
