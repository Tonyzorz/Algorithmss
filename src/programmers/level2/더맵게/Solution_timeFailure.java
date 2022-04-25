package programmers.level2.더맵게;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_timeFailure {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        List<Integer> scovilleList = convertToList(scoville);
        Collections.sort(scovilleList);
        
        while (scovilleList.size() > 1) {

            if (scovilleList.get(0) > K) {
                break;
            }
            
            Integer firstLeast = scovilleList.get(0);
            Integer secondLeast = scovilleList.get(1);
            
            scovilleList.remove(0);
            scovilleList.remove(0);
            
            int mixedLeast = firstLeast + (secondLeast * 2);
            scovilleList.add(mixedLeast);
            
            Collections.sort(scovilleList);
            answer++;
        }
        
        if (scovilleList.size() == 1 && scovilleList.get(0) < K) {
            return -1;
        }
        
        return answer;
    }
    
    public List<Integer> convertToList(int[] scoville) {
        List<Integer> list = new ArrayList<>();
        
        for (int data : scoville) {
            list.add(data);
        }
        
        return list;
    }
    
    @Test
    public void answer() {
        //given
        int[] scoville1 = {1, 2, 3, 9, 10, 12};
        
        int K1 = 7;
        
        //when
        int answer1 = 2;
        
        //then
        Assert.assertEquals(answer1, solution(scoville1, K1));
    }
}
