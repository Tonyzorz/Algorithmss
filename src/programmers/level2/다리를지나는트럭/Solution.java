package programmers.level2.다리를지나는트럭;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public class Truck {

        int seconds;
        int truck_weight;

        public Truck(int seconds, int truck_weight) {
            this.seconds = 1;
            this.truck_weight = truck_weight;
        }

        public int getSeconds() {
            return seconds;
        }

        public int getTruck_weight() {
            return truck_weight;
        }

        public void setSeconds(int seconds) {
            this.seconds = seconds;
        }

        public void setTruck_weight(int truck_weight) {
            this.truck_weight = truck_weight;
        }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Truck> beforeTrucks = new LinkedList<>();
        for (int truck_weight : truck_weights) {
            beforeTrucks.add(new Truck(0, truck_weight));
        }

        Queue<Truck> currentTrucks = new LinkedList<>();

        Truck firstTruck = beforeTrucks.poll();
        currentTrucks.add(firstTruck);

        int bridge_weight = firstTruck.getTruck_weight();
        int seconds = 1;
        while (!beforeTrucks.isEmpty() || !currentTrucks.isEmpty()) {

            // 다리위에 있는 트럭들 하나씩 건너자
            int check = currentTrucks.size();
            bridge_weight = 0;
            for (int i = 0; i < check; i++) {
                Truck truck = currentTrucks.poll();
                truck.setSeconds(truck.getSeconds() + 1);

                if (truck.getSeconds() <= bridge_length) {
                    bridge_weight += truck.getTruck_weight();
                    currentTrucks.add(truck);
                }
            }

            // 다음 트럭와도 무게제한 끄떡없다, 와라
            Truck nextTruck = beforeTrucks.peek();
            if (null != nextTruck) {
                if (bridge_weight + nextTruck.getTruck_weight() <= weight) {
                    Truck truck = beforeTrucks.poll();
                    currentTrucks.add(truck);
                }
            }

            if (currentTrucks.isEmpty() && beforeTrucks.isEmpty()) {
                break;
            }

            seconds++;
        }

        return ++seconds;
    }

    @Test
    public void answer() {
        //given
        int bridge_length1 = 2;
        int bridge_length2 = 100;
        int bridge_length3 = 100;

        int weight1 = 10;
        int weight2 = 100;
        int weight3 = 100;

        int[] truck_weights1 = {7,4,5,6};
        int[] truck_weights2 = {10};
        int[] truck_weights3 = {10,10,10,10,10,10,10,10,10,10};

        //when
        int answer1 = 8;
        int answer2 = 101;
        int answer3 = 110;

        //then
        Assert.assertEquals(answer1, solution(bridge_length1, weight1, truck_weights1));
        Assert.assertEquals(answer2, solution(bridge_length2, weight2, truck_weights2));
        Assert.assertEquals(answer3, solution(bridge_length3, weight3, truck_weights3));
    }
}
