class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        int end = pat.length();

        for (int i = 0; i < myString.length() - end + 1; i++) {
            String str = myString.substring(i, i + end);

            if (str.equals(pat)) {
                answer++;
            }
        }

        return answer;
    }
}