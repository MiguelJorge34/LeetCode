class Solution {
    public void moveZeroes(int[] nums) {
        
        int size = nums.length;
        int index = 0;

        for(int i = 0; i < size; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        for(int i = index ; i < size ; i++){
            nums[i] = 0;
        }
        
    }
}
