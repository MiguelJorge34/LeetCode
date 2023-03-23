class Solution {
    public int search(int[] nums, int target) {
        // iniciar os dois apontadores
        int low = 0;
        int high = nums.length-1;
        // enquanto o high for maior ou igual ao low quer dizer que ainda ha chance de encontrar
        // o numero quando isto deixar de acontecer ja percorremos todos os sitios possiveis
        while(low <= high){
            int mid = (low + high) / 2; // apontador para o meio 

            if(nums[mid] == target){// se isto acontecer encontramos o nosso numero
                return mid;
            }

            if(nums[low]<= nums[mid]){ // a primeira parte do array esta ordenada

                if(target <= nums[mid] && target >= nums[low] ){
                    high = mid - 1;
                }
                else{
                    low = mid+1;
                }
            }
            else{// a segunda parte do array esta ordenada
                if(target >= nums[mid] && target <= nums[high]){
                    low = mid +1;
                }
                else{
                    high = mid - 1;
                }

            }
        }
        return -1;
        
    }
}
