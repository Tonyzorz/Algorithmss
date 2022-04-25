package programmers.level2.기능개발;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> progressList = convertToList(progresses);
        List<Integer> speedList = convertToList(speeds);

        List<Integer> answer = new ArrayList<>();

        while (!progressList.isEmpty()) {

            // add progress per speed
            for (int i = 0; i < progressList.size(); i++) {
                Integer progress = progressList.get(i) + speedList.get(i);
                progressList.set(i, progress);
            }

            int finished = 0;
            for (int i = 0; i < progressList.size(); i++) {
                Integer progress = progressList.get(i);
                if (progress >= 100) {
                    finished++;
                } else {
                    break;
                }
            }

            if (finished == 0) {
                continue;
            }

            for (int i = 0; i < finished; i++) {
                progressList.remove(0);
                speedList.remove(0);
            }

            answer.add(finished);
        }

        return convertToArray(answer);
    }

    public int[] convertToArray(List<Integer> list) {
        int[] array = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

    public List<Integer> convertToList(int[] array) {
        List<Integer> list = new ArrayList<>();

        for (int data : array) {
            list.add(data);
        }

        return list;
    }

    @Test
    public void answer() {
        //given
        int[] progresses1 = {93, 30, 55};
        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] progresses3 = {20, 99, 93, 30, 55, 10};
        int[] progresses4 = {55, 60, 65};
        int[] progresses5 = {99, 1, 99, 1};
        int[] progresses6 = {96, 99, 98, 97};
        int[] progresses7 = {0, 0, 0, 0};

        int[] speeds1 = {1, 30, 5};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        int[] speeds3 = {5, 10, 1, 1, 30, 5};
        int[] speeds4 = {5, 10, 7};
        int[] speeds5 = {1, 1, 1, 1};
        int[] speeds6 = {1, 1, 1, 1};
        int[] speeds7 = {100, 50, 34, 25};

        //when
        int[] answer1 = {2, 1};
        int[] answer2 = {1, 3, 2};
        int[] answer3 = {3, 3};
        int[] answer4 = {3};
        int[] answer5 = {1, 3};
        int[] answer6 = {4};
        int[] answer7 = {1, 1, 1, 1};

        //then
        Assert.assertArrayEquals(answer1, solution(progresses1, speeds1));
        Assert.assertArrayEquals(answer2, solution(progresses2, speeds2));
        Assert.assertArrayEquals(answer3, solution(progresses3, speeds3));
        Assert.assertArrayEquals(answer4, solution(progresses4, speeds4));
        Assert.assertArrayEquals(answer5, solution(progresses5, speeds5));
        Assert.assertArrayEquals(answer6, solution(progresses6, speeds6));
        Assert.assertArrayEquals(answer7, solution(progresses7, speeds7));
    }
}
