class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int firstPointer = 0;
       int [] result = new int[2];

       int secondPointer = numbers.length - 1;

       while (firstPointer <= secondPointer){
           int sum = numbers[secondPointer] + numbers[firstPointer];

           if (sum > target){
               secondPointer -= 1;

           }
           else if (sum < target){
               firstPointer += 1;

           }
           else{
               result[0] = firstPointer +1;
               result[1] = secondPointer +1;
               return result;
           }
       }
       return result;
    }
}
