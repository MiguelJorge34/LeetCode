class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character,Integer> mapS = new HashMap <>();

        HashMap <Character,Integer> mapT = new HashMap <>();

        for(int i = 0 ; i < s.length() ; i++){
            mapS.put(s.charAt(i) , mapS.getOrDefault(s.charAt(i) , 0) +1);
        }
        for(int j = 0 ; j < s.length() ; j++){
            mapT.put(t.charAt(j) , mapT.getOrDefault(t.charAt(j) , 0) +1);
        }

        for(Character ch : mapS.keySet()){
            int val1 = mapS.get(ch); 
            int val2 = mapT.getOrDefault(ch,0);


            if(val1 != val2){return false;}
        }
        
        return true;

    }
}
