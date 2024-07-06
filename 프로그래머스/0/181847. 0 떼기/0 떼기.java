class Solution {
    public String solution(String n_str) {

        if (n_str.charAt(0) != '0') return n_str;
        
        int index = 1;
        for (; index < n_str.length(); index++) {

            if (n_str.charAt(index) != '0') break;

        }

        return n_str.substring(index, n_str.length());
    }
}