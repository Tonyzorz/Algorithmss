package programmers.호텔방배정;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution {

/*    public long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];
        
        HashMap<Long, Boolean> map = new HashMap<>();
        for (long i = 1; i <= k; i++) {
            map.put(i, true);
        }
        
        for (int i = 0; i < room_number.length; i++) {
            long idx = room_number[i];
            
            for (long j = idx; j <= k; j++) {
                Boolean isAvailable = map.getOrDefault(j, false);
                if (isAvailable) {
                    answer[i] = j;
                    map.put(j, false);
                    break;
                }
            }
        }

//        System.out.println(Arrays.toString(answer));
        
        return answer;
    }*/

/*    public long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];
                
        Set<Long> set = new HashSet<>();

        for (int i = 0; i < room_number.length; i++) {
            long idx = room_number[i];

            for (long j = idx; j <= k; j++) {
                boolean contains = set.contains(j);
                if (!contains) {
                    answer[i] = j;
                    set.add(j);
                    break;
                }
            }
        }

//        System.out.println(Arrays.toString(answer));

        return answer;
    }*/
    
    HashMap<Long, Long> map = new HashMap<>();
    public long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];

        for (int i = 0; i < room_number.length; i++) {
            answer[i] = findEmptyRoom(room_number[i]);
        }

        System.out.println(Arrays.toString(room_number));
        return answer;
    }
    
    public long findEmptyRoom(long room) {
        if (!map.containsKey(room)) {
            map.put(room, room + 1);
            return room;
        }

        Long nextRoom = map.get(room);
        Long emptyRoom = findEmptyRoom(nextRoom);
        map.put(room, emptyRoom);
        return emptyRoom;
    }
    
    @Test
    public void answer() {
        //given
        int k = 10;
        long[] room_number = {1,3,4,1,3,1};
        
        //when
        long[] result = {1,3,4,2,5,6};
        
        //then
        Assert.assertArrayEquals(result, solution(k, room_number));
    }
}
