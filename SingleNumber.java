
public class Solution {
public int singleNumber(int[] nums) {
    
    Hashtable<Integer,Integer> table = new Hashtable();
    
    for(int i=0;i<nums.length;i++)
    {
        if(table.containsKey(nums[i]) == false)
        {
            table.put(nums[i],i);
        }
        else
        {
            table.remove(nums[i]);
        }
    }
    Enumeration<Integer> keys = table.keys();
    return keys.nextElement();
    }
}

// basicamente se encontrarmos um elemento novo juntamos a hash se for um ja existente tiramos no final fica na hash apenas o elemento que não é repetido
