package programmers.bfs_dfs.traveling_route;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution_bfs_fail {
    
    public String[] solution(String[][] tickets) {
        ArrayList<String> answer = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < tickets.length; i++) {
            String start = tickets[i][0];
            String to = tickets[i][1];

            ArrayList<String> list = map.getOrDefault(start, new ArrayList<>());
            if (!list.contains(to)) {
                list.add(to);
            }

            map.put(start, list);
        }

        Queue<String> queue = new LinkedList<>();
        queue.add("ICN");
        
        while (!queue.isEmpty()) {
            String city = queue.poll();
            answer.add(city);

            ArrayList<String> list = map.getOrDefault(city, new ArrayList<>());
            
            if (list.isEmpty()) {
                continue;
            }
            
            Collections.sort(list);
            
            String nextCity = list.get(0);
            list.remove(nextCity);
            map.put(city, list);
            
            queue.add(nextCity);
        }

        return answer.stream().toArray(String[]::new);
    }
    
    @Test
    public void answer() {
        //given
        String[][] tickets1 = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[][] tickets2 = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        String[][] tickets3 = {{"ICN", "JFK"}, {"ICN", "AAD"}, {"JFK", "ICN"}};
        
        //when
        String[] answer1 = {"ICN", "JFK", "HND", "IAD"};
        String[] answer2 = {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"};
        String[] answer3 = {"ICN", "JFK", "ICN", "AAD"};
        
        //then
//        Assert.assertArrayEquals(answer1, solution(tickets1));
//        Assert.assertArrayEquals(answer2, solution(tickets2));
        Assert.assertArrayEquals(answer3, solution(tickets3));
        
    }
}
