class Solution {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i <= s.length()/2; i++) {
            int cnt = 1;
            String pattern = s.substring(0, i);
            String result = "";

            for (int j = i; j <= s.length(); j += i) {

                String next = s.substring(j, j + i > s.length() ? s.length() : j + i);
                if (pattern.equals(next)) {
                    cnt++;
                } else {

                    result += (cnt > 1) ? cnt : "";
                    result += pattern;
                    pattern = next;
                    cnt = 1;
                }
            }

            result += pattern;
            answer = Math.min(answer, result.length());
        }
        return answer;
    }
}