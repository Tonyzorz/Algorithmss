import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            String name = callings[i];

            Integer idx = map.get(name) - 1;
            map.put(name, idx);


            String temp = players[idx];
            players[idx] = name;
            players[idx + 1] = temp;

            map.put(temp, idx + 1);
        }

        return players;
    }
}