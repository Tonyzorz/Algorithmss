import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        switch (n) {
            case 1 :
                answer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
                break;
            case 2 :
                answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
                break;
            case 3 :
                answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                break;
            case 4 :
                int[] list = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);

                int length = (int) Math.ceil((float)list.length / slicer[2]);
                answer = new int[length];
                
                for (int i = 0; i < length; i++) {
                    answer[i] = list[i * slicer[2]];
                }

                break;
        }

        return answer;
    }
}