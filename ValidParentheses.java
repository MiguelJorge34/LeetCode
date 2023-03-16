
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

class Solution {
    public  boolean isValid(String s) {
        Map <Character,Character> closer = new HashMap<>();
        closer.put('(' ,')');
        closer.put('{' ,'}');
        closer.put('[' ,']');
        Stack<Character> openersList = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(closer.containsKey(c)) {
                openersList.push(c);
            } else {
                if(openersList.isEmpty()) {
                    return false;
                }
                char target = openersList.pop();
                if(!closer.containsKey(target) || closer.get(target) != c) {
                    return false;
                }
            }
        }
        if (!openersList.isEmpty()){return false;}
        else{return true;}

        }
        }
