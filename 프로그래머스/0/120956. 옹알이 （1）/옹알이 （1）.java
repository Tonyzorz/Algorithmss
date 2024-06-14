class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] able = {"aya", "ye", "woo", "ma"};

        for (String babble : babbling) {
            for (String ab : able) {
                babble = babble.replace(ab, " ");
            }

            if (babble.replace(" ", "").isEmpty()) answer++;
        }

        return answer;
    }
}