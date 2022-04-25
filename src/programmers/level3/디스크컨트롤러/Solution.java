package programmers.level3.디스크컨트롤러;

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
        
//        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        Arrays.sort(jobs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        
//        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        
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
        int[][] jobs1 = {{0, 3}, {1, 9}, {2, 6}};
        int[][] jobs2 = {{0, 10}, {2, 10}, {9, 10}, {15, 2}};
        int[][] jobs3 = {{0, 10}, {2, 12}, {9, 19}, {15, 17}};
        int[][] jobs4 = {{0, 1}};
        int[][] jobs5 = {{1000, 1000}};
        int[][] jobs6 = {{0, 1}, {0, 1}, {0, 1}};
        int[][] jobs7 = {{0, 3}, {1, 9}, {2, 6}, {30, 3}};
        int[][] jobs8 = {{0, 10}, {4, 10}, {15, 2}, {5, 11}};
        int[][] jobs9 = {{10, 10}, {30, 10}, {50, 2}, {51, 2}};
        int[][] jobs10 = {{1, 9}, {1, 4}, {1, 5}, {1, 7}, {1, 3}};
        int[][] jobs11 = {{24, 10}, {28, 39}, {43, 20}, {37, 5}, {47, 22}, {20, 47}, {15, 34}, {15, 2}, {35, 43}, {26, 1}};
        int[][] jobs12 = {{24, 10}, {28, 39}, {43, 20}, {37, 5}, {47, 22}, {20, 47}, {15, 2}, {15, 34}, {35, 43}, {26, 1}};
        
        //when
        int answer1 = 9;
        int answer2 = 14;
        int answer3 = 25;
        int answer4 = 1;
        int answer5 = 1000;
        int answer6 = 2;
        int answer7 = 7;
        int answer8 = 15;
        int answer9 = 6;
        int answer10 = 13;
        int answer11 = 72;
        int answer12 = 72;
        
        //then
        Assert.assertEquals(answer1, solution(jobs1));
        Assert.assertEquals(answer2, solution(jobs2));
        Assert.assertEquals(answer3, solution(jobs3));
        Assert.assertEquals(answer4, solution(jobs4));
        Assert.assertEquals(answer5, solution(jobs5));
        Assert.assertEquals(answer6, solution(jobs6));
        Assert.assertEquals(answer7, solution(jobs7));
        Assert.assertEquals(answer8, solution(jobs8));
        Assert.assertEquals(answer9, solution(jobs9));
        Assert.assertEquals(answer10, solution(jobs10));
        Assert.assertEquals(answer11, solution(jobs11));
        Assert.assertEquals(answer12, solution(jobs12));
    }
}
