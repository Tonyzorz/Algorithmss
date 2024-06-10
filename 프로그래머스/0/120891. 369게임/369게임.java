class Solution {
    public int solution(int order) {
        int answer = 0;

        String[] strings = String.valueOf(order).split("");
        for (String string : strings) {
            if (string.equals("3") || string.equals("6") || string.equals("9")) {
                answer++;
            }
        }

        return answer;
    }
}