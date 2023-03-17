class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // cria a tabela para ocorrencia e numero de ocorrencia de chars em S
        HashMap <Character,Integer> mapS = new HashMap <>();
        // cria a tabela para ocorrencia e numero de ocorrencia de chars em T
        HashMap <Character,Integer> mapT = new HashMap <>();
        // insere os chars e o numero de vezes que foram vistos S
        for(int i = 0 ; i < s.length() ; i++){
            mapS.put(s.charAt(i) , mapS.getOrDefault(s.charAt(i) , 0) +1);
        }
        // insere os chars e o numero de vezes que foram vistos T
        for(int j = 0 ; j < s.length() ; j++){
            mapT.put(t.charAt(j) , mapT.getOrDefault(t.charAt(j) , 0) +1);
        }
        //Percorre as keys de S ve se o T tem essa key e compara as ocorrencias se forem diferentes não é anagrama
        for(Character ch : mapS.keySet()){
            int val1 = mapS.get(ch); 
            int val2 = mapT.getOrDefault(ch,0);


            if(val1 != val2){return false;}
        }
        
        return true;

    }
}
