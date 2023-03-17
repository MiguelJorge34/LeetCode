class Solution {
    public boolean isPalindrome(int x) {
        String l = Integer.toString(x);
        int y = l.length() ;

        for (int i = 0 ; i < l.length(); i++)
        {   
            y--;
            if (l.charAt(i) != l.charAt(y)){
                return false;
            }

        }
        return true;
    }
}
