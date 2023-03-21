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
