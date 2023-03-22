class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        return addNode(nums,0,nums.length-1);
    }
    public TreeNode addNode(int[] nums,int left,int right){
        if (left > right){
            return null;
        }

        int middle = left +(right-left)/2;

        TreeNode node = new TreeNode(nums[middle]);
        if(middle - 1 >= left){
            node.left = addNode(nums,left,middle-1);
        }
        if(middle + 1 <= right){
             node.right = addNode(nums,middle+1,right);

        }
        return node;


    }
}
