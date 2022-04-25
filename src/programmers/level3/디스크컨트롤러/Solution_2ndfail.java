package programmers.level3.디스크컨트롤러;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class Solution_2ndfail {

    public class Process implements Comparable<Process>{
        
        int requested;
        int duration;
        int end = 9999;

        public Process(int requested, int duration) {
            this.requested = requested;
            this.duration = duration;
        }

        public int getRequested() {
            return requested;
        }

        public void setRequested(int requested) {
            this.requested = requested;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
        
        @Override
        public int compareTo(Process o) {
            
            // 요청 시간이 빨리 처리되는 순서로 정렬
            if (this.end > o.getEnd()) {
                return 1;
            } else if (this.end < o.getEnd()) {
                return -1;
            
            // requested 으로 비교 
            } else {
                
                if (this.requested > o.getRequested()) {
                    return 1;
                } else if (this.requested < o.getRequested()) {
                    return -1;
                    
                // 동일한 시간때 들어왔으면 먼저 들어온 순서로 처리를 한다.
                } else {
                    return 0;
                }
            }
        }
    }

    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Process> waitingQueue = new PriorityQueue<>();
        for (int i = 0; i < jobs.length; i++) {
            waitingQueue.add(new Process(jobs[i][0], jobs[i][1]));
        }

        PriorityQueue<Process> processingQueue = new PriorityQueue<>();
        processingQueue.add(waitingQueue.poll());
        
        int currentSecond = 0;
        while (true) {
            
            if (waitingQueue.isEmpty() && processingQueue.isEmpty()) {
                break;
            }
            
            Process currentProcess = null;
            int time = 0;
            // 처리중 큐 프로세스 처리하기 
            if (processingQueue.isEmpty()) {
                if (waitingQueue.isEmpty()) {
                    break;
                }
                
                currentProcess = waitingQueue.poll();
                currentProcess.setEnd(currentProcess.getDuration());
                currentSecond = currentProcess.getRequested() + currentProcess.getDuration();
                time = currentProcess.getDuration();
                
            } else {
                currentProcess = processingQueue.poll();
                currentSecond += currentProcess.getDuration();
                time = currentSecond - currentProcess.getRequested();
            }

            answer += time;

            // 대기중 프로세스 현재 진행중인 프로세스 시간만큼 넣기 
            while (true) {
                if (waitingQueue.isEmpty()) {
                    break;
                }

                Process peekProcess = waitingQueue.peek();
                if (peekProcess.getRequested() < currentSecond) {
                    Process nextProcess = waitingQueue.poll();
                    int end = Math.abs(nextProcess.getDuration() - nextProcess.getRequested());
                    nextProcess.setEnd(end);

                    processingQueue.add(nextProcess);
                    
                } else {
                    break;
                }
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
//        Assert.assertEquals(answer1, solution(jobs1));
//        Assert.assertEquals(answer2, solution(jobs2));
//        Assert.assertEquals(answer3, solution(jobs3));
//        Assert.assertEquals(answer4, solution(jobs4));
//        Assert.assertEquals(answer5, solution(jobs5));
//        Assert.assertEquals(answer6, solution(jobs6));
//        Assert.assertEquals(answer7, solution(jobs7));
        Assert.assertEquals(answer8, solution(jobs8));
//        Assert.assertEquals(answer9, solution(jobs9));
//        Assert.assertEquals(answer10, solution(jobs10));
//        Assert.assertEquals(answer11, solution(jobs11));
//        Assert.assertEquals(answer12, solution(jobs12));
    }
}
