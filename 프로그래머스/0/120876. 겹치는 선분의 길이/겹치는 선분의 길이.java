class Solution {
    public int solution(int[][] lines) {
        int[] rails = new int[200];

        for (int[] line : lines) {
            for (int i = line[0] + 100; i < line[1] + 100; i++) {
                rails[i]++;
            }
        }

        int answer = 0;
        for (int rail : rails) {
            if (rail > 1) answer++;
        }

        return answer;
    }
}