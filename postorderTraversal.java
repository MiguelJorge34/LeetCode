class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root == null){
            return res;
        }

        postOrderTraversal(root,res);
        return res;
    }

    public void postOrderTraversal(TreeNode root,List<Integer>res){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left,res);
        postOrderTraversal(root.right,res);
        res.add(root.val);
    }

    
}
