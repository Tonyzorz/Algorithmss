package programmers.level1._old.제일작은수제거하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /*
    제일 작은 수 제거하기
문제 설명
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
입출력 예
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]
     */
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        int smallest = arr[0];
        int index = 0;

        List<Integer> integers = new ArrayList<>();
        integers.add(smallest);

        for (int i = 1; i < arr.length; i++) {
            int next = arr[i];
            if (smallest > next) {
                smallest = next;
                index = i;
            }
            integers.add(next);
        }

        integers.remove(index);

        return integers.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {4,3,2,1,5};

        System.out.println(Arrays.toString(solution.solution(arr)));
    }
}
