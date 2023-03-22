class Solution {
    public int climbStairs(int n) {
        int w = 1;
        int w1 = 1;
        int temp;
        if (n == 0){
            return 0 ;
        }
        if (n == 1){
            return 1 ;
        }
        for(int i = 2 ; i <= n; i++ ){
            temp = w;
            w = w + w1;
            w1 = temp;
        }
        return w;
        
    }

}
