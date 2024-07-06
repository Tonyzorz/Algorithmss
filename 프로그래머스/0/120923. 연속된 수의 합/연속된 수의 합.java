import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = (num + total) * -1; i <= total; i++) {

            int nums = 0;
            for (int j = 0; j < num; j++) {
                int testNum = i + j;
                nums += testNum;
                list.add(testNum);
            }

            if (nums == total) {
                break;
            }

            list.clear();
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}