class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        
        String[] strs = code.split("");
        for (int i = 0; i < strs.length; i++) {
            if (i % q == r) sb.append(strs[i]);
        }

        return sb.toString();
    }
}