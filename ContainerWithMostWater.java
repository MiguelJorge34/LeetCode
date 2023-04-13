class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxWater = 0;
        while( i <= j){
            int water = Math.min(height[i],height[j]) * (j-i);
            maxWater = Math.max(water,maxWater);
            if(height[i] > height[j]){
                j = j - 1;
            }
            else{
                i = i + 1;
            }
        }
        return maxWater;
    }
}
