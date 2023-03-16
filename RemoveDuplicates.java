class Solution {
    public int removeDuplicates(int[] nums) {
        int tamanho = nums.length;
        if(tamanho <= 1){
            return tamanho;
        }
        int primeiroApontador = 0;
        int segundoApontador = 1;
        
        
        while(segundoApontador <= tamanho-1){
            if(nums[primeiroApontador] == nums[segundoApontador]){
                segundoApontador++;
            }
            else{
                nums[primeiroApontador + 1] = nums[segundoApontador];
                primeiroApontador++;
                segundoApontador++;
            }
            
        }
        return primeiroApontador + 1;
    }
}
