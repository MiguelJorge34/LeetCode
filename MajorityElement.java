class Solution {
	 public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int x = nums.length/2;
        return nums[x];
    }
}


// a usar hashmap

class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap <Integer,Integer> map = new HashMap<>();
        int value = 0;
        int comp = nums.length / 2 ;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i],  1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > comp) {
                value = entry.getKey();
            }
        } 


        return value;
        

    }
}
