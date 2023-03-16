import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       Map <Character, Integer> dic = new HashMap<>();
       for(int i = 0 ; i < magazine.length(); i++){
           char c = magazine.charAt(i);
           if(dic.get(c)== null){
               dic.put(c,1);
           }
           else{
               int j = dic.get(c);
               j = j +1;
               dic.put(c,j);
           }
           
        }
        System.out.println(dic);
        for(int h = 0; h < ransomNote.length(); h++){
            if (dic.get(ransomNote.charAt(h)) == null){
                return false;

            }
            
            else if(dic.get(ransomNote.charAt(h))== 0){
                return false;
            }
            else{
                int w = dic.get(ransomNote.charAt(h));
                w = w - 1;
                dic.put(ransomNote.charAt(h),w);

            }
           
        
        }
        System.out.println(dic);
        return true;
    }

}
