package programmers.bfs_dfs.traveling_route;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution_dfs {

    boolean[] visited;
    ArrayList<String> allRoute = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        
        visited = new boolean[tickets.length];

        dfs("ICN", "ICN", tickets, 0);
        
        Collections.sort(allRoute);
        
        return allRoute.get(0).split(" ");
    }

    public void dfs(String start, String route, String[][] tickets, int cnt) {
        if (cnt == tickets.length) {
            allRoute.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (start.equals(tickets[i][0]) && !visited[i]) {
                visited[i] = true;
                dfs(tickets[i][1], route + " " + tickets[i][1], tickets, cnt + 1);
                visited[i] = false;
            }
        }
    }

    @Test
    public void answer() {
        //given
        String[][] tickets1 = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[][] tickets2 = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
        String[][] tickets3 = {{"ICN", "JFK"}, {"ICN", "AAD"}, {"JFK", "ICN"}};

        //when
        String[] answer1 = {"ICN", "JFK", "HND", "IAD"};
        String[] answer2 = {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"};
        String[] answer3 = {"ICN", "JFK", "ICN", "AAD"};

        //then
        Assert.assertArrayEquals(answer1, solution(tickets1));
        Assert.assertArrayEquals(answer2, solution(tickets2));
        Assert.assertArrayEquals(answer3, solution(tickets3));

    }
}
