class Solution {
    public int solution(String my_string) {
        int answer = 0;

        char[] charArray = my_string.toCharArray();
        
        StringBuilder sb = new StringBuilder("0");
        for (char chars : charArray) {
            if (Character.isDigit(chars)) {
                sb.append(chars);

            } else {
                answer += Integer.parseInt(sb.toString());
                sb.setLength(0);
                sb.append("0");
            }
        }

        if (sb.length() > 0) {
            answer += Integer.parseInt(sb.toString());
        }

        return answer;
    }
}