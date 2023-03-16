class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int [] sums = new int [accounts.length];
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[0].length;j++){
                sum += accounts[i][j];
                sums[i] = sum;

            }
        }

        int max = 0;
        for (int i = 0; i < accounts.length; i++){
            if (sums[i] > max) {
                max = sums[i];
            }
        }
        return max; 
    }

}
