class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        String[] strings = my_string.split("");
        
        for (String string : strings) {
            if (string.charAt(0) >= 'a' && string.charAt(0) <= 'z') {
                sb.append(string.toUpperCase());
            } else {
                sb.append(string.toLowerCase());
            }
        }

        return sb.toString();
    }
}