class Solution {
    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>(); // stack implementada com LinkedList
        LinkedList<Integer> output = new LinkedList<>(); //LinkedList output
        
        if(root == null){ // optimizar se nao houver arvore returnar a lista vazia
            return output;
        }

        stack.add(root); // adicionar a root a stack 

        while(!stack.isEmpty()){
            Node node = stack.pollLast();// 

            output.addFirst(node.val);

            for(Node child : node.children){
                stack.add(child);
            }
        }
        return output;

    }
}

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
