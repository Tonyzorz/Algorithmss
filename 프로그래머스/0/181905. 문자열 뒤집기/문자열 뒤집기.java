class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuffer sb = new StringBuffer();

        char[] charArray = my_string.toCharArray();
        for (int i = 0; i < (e - s + 1) / 2; i++) {
            char temp = charArray[s + i];
            charArray[s + i] = charArray[e - i];
            charArray[e - i] = temp;
        }

        for (char c : charArray) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}