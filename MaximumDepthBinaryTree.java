class Solution {
    public int maxDepth(TreeNode root) {
        int answer = 0;
        if (root == null){return answer;}
        int maxDepthLeft = maxDepth(root.left);
        int maxDepthRight = maxDepth(root.right);
        return Math.max(maxDepthLeft,maxDepthRight)+1;

        
    }
}
