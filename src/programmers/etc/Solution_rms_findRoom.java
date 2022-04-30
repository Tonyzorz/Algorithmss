package programmers.etc;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution_rms_findRoom {

    public class RoomDTO {

        private int roomCapacity;

        private int roomCount;

        public RoomDTO(int roomCapacity, int roomCount) {
            this.roomCapacity = roomCapacity;
            this.roomCount = roomCount;
        }

        public int getRoomCapacity() {
            return roomCapacity;
        }

        public void setRoomCapacity(int roomCapacity) {
            this.roomCapacity = roomCapacity;
        }

        public int getRoomCount() {
            return roomCount;
        }

        public void setRoomCount(int roomCount) {
            this.roomCount = roomCount;
        }
    }

    public boolean solution(List<RoomDTO> remainingRoomList) {

        TreeMap<Integer, ArrayList<ArrayList<Integer>>> roomMap = new TreeMap<>();

        boolean[] visited = new boolean[remainingRoomList.size()];

        for (int i = 0; i < remainingRoomList.size(); i++) {

            RoomDTO room = remainingRoomList.get(i);


            int roomCapacity = room.getRoomCapacity();
            int roomCount = room.getRoomCount();

            visited[i] = true;

            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < roomCount; j++) {
                list.add(roomCapacity);
                int sum = list.stream().mapToInt(Integer::intValue).sum();

                ArrayList<ArrayList<Integer>> mapValue = roomMap.getOrDefault(sum, new ArrayList<>());
                ArrayList<Integer> test = new ArrayList<>(list);
                mapValue.add(test);
                roomMap.put(sum, mapValue);

                bruteForce(roomMap, remainingRoomList, visited, 1, test);
            }
        }


        System.out.println("???");
        return true;
    }

    public void bruteForce(Map<Integer, ArrayList<ArrayList<Integer>>> roomMap, List<RoomDTO> remainingRoomList, boolean[] visited, int index, ArrayList<Integer> list) {

        // 모든 방을 검색했다는 뜻
        if (index == remainingRoomList.size()) {
            return;
        }

        for (int i = 0; i < remainingRoomList.size(); i++) {

            if (!visited[i]) {
                visited[i] = true;

                RoomDTO room = remainingRoomList.get(i);


                int roomCapacity = room.getRoomCapacity();
                int roomCount = room.getRoomCount();


                ArrayList<Integer> test = new ArrayList<>(list);
                for (int j = 0; j < roomCount; j++) {
                    test.add(roomCapacity);
                    int sum = test.stream().mapToInt(Integer::intValue).sum();

                    ArrayList<ArrayList<Integer>> mapValue = roomMap.getOrDefault(sum, new ArrayList<>());
                    ArrayList<Integer> test2 = new ArrayList<>(test);
                    mapValue.add(test2);
                    roomMap.put(sum, mapValue);

                    bruteForce(roomMap, remainingRoomList, visited, index + 1, test2);
                }

                visited[i] = false;
            }
        }
    }

    @Test
    public void answer() {
        //given
        List<RoomDTO> remainingRoomList = new ArrayList<>();
        remainingRoomList.add(new RoomDTO(4, 2));
        remainingRoomList.add(new RoomDTO(2, 5));
        remainingRoomList.add(new RoomDTO(6, 1));
        remainingRoomList.add(new RoomDTO(10, 1));

        //when

        //then
        Assert.assertEquals(true, solution(remainingRoomList));
    }
}
