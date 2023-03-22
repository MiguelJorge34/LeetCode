class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> output = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            if(root == null){
                return output;
            }
            TreeNode current = root;

            while(current != null || !stack.isEmpty()){
                while(current != null){
                    stack.push(current);
                    current = current.left;
                }
                current = stack.pop();
                output.add(current.val);
                current = current.right;


            }
            return output;
        }
    
}
//Solução mais facil

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        inOrder(root,res);
        return res;
    }
    public void inOrder(TreeNode root,List<Integer> res){
        if(root == null) {
            return;
        }
        inOrder(root.left,res);
        res.add(root.val);
        inOrder(root.right,res);
        
        
    }
}
