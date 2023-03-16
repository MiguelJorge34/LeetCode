import java.util.Hashtable;
class Solution {
    public boolean checkIfExist(int[] arr) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for(int i= 0;i <arr.length;i++){
            hashtable.put(arr[i],arr[i]*2);    
            
            
        }
        
        
        for(int j = 0 ; j < arr.length;j++){
            int h = 0;
            while(h<arr.length){
                
                if(hashtable.get(arr[j])==arr[h]&& j !=h){
                    
                    return true;
                    
                }
                h++;
            }
            
        }
        
        return false;
    }
}
