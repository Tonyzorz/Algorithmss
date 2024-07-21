package programmers.heap.disk_controller;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

     public int solution(int[][] jobs) {
        int answer = 0;

        int end = 0;
        int jobsIdx = 0;
        int count = 0;

        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1]));

        while (count < jobs.length) {
            while (jobsIdx < jobs.length && jobs[jobsIdx][0] <= end) {
                pq.add(jobs[jobsIdx++]);
            }

            if (pq.isEmpty()) {
                end = jobs[jobsIdx][0];
            } else {
                int[] temp = pq.poll();
                answer += temp[1] + end - temp[0];
                end += temp[1];
                count++;
            }
        }

        return answer / jobs.length;
    }

    @Test
    public void answer() {
        //given
        int[][] jobs = {{0,3},{1,9},{2,6},};

        //when
        int answer = 9;

        //then
        Assert.assertEquals(answer, solution(jobs));
    }
}
