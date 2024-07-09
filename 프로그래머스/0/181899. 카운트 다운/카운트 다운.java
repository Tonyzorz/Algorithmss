import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start_num, int end_num) {
        return IntStream.range(end_num, start_num + 1)
                        .map(i -> start_num - i + end_num)
                        .toArray();
    }
}