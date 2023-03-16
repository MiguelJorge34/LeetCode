import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] mergedNum = new int[n+m];
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j = 0;
        
        int [] num1S = new int[m];
        
        int [] num2S = new int[n];
        
        for(int i = 0 ; i < nums1.length ; i++){
            if(nums1[i]!=0){
                num1S[j] = nums1[i];
                j = j + 1;
                
            }
        }
        
        int w = 0;
        
        for(int h = 0 ; h < nums2.length ; h++){
            if(nums2[h]!=0){
                num2S[w] = nums2[h];
                w = w + 1;
            }
        }

        
        
        System.arraycopy(num1S, 0, mergedNum, 0, m);
        System.arraycopy(num2S, 0, mergedNum, m, n);;
        
        Arrays.sort(mergedNum);
        System.arraycopy(mergedNum, 0, nums1, 0, n+m);
        
        
    }
}
