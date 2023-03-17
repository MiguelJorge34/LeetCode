class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int hl = getHeight(root.left);
        int hr = getHeight(root.right);
        return Math.abs(hr - hl) <= 1 
            && isBalanced(root.left)
        && isBalanced(root.right);
    }
    
    private int getHeight(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
