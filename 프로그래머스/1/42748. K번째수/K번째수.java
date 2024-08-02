import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int index = commands[i][2];

            int[] organized = cutAndSort(array, start, end);
            answer[i] = organized[index - 1];

        }

        return answer;
    }

    public int[] cutAndSort(int[] array, int start, int end) {

        int[] cutted = new int[end - start + 1];

        int index = 0;
        for (int i = start; i <= end; i++) {
            cutted[index] = array[i];
            index++;
        }
        Arrays.sort(cutted);

        return cutted;
    }
}