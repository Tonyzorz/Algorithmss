package programmers.level2.오픈채팅방;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public String[] solution(String[] record) {
        String[] answer = {};
        
        HashMap<String, String> users = new HashMap<>();
        
        for (int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");
            String action = info[0];
            
            if (action.equals("Leave")) {
                continue;
            }
            
            String userid = info[1];
            String username = info[2];
            
            users.put(userid, username);
            
        }
        
        ArrayList<String> chatRoom = new ArrayList<>();
        for (int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");
            String action = info[0];
            String userid = info[1];

            if (action.equals("Change")) {
                continue;
            }

            String username = users.get(userid);
            if (action.equals("Enter")) {
                chatRoom.add(username + "님이 들어왔습니다.");
            } else {
                chatRoom.add(username + "님이 나갔습니다.");
            }
        }
        
        return chatRoom.toArray(new String[0]);
    }
    
    @Test
    public void answer() {
        //given
        String[] records = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] result = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
        //when
        //then
        Assert.assertArrayEquals(result, solution(records));
    }
}
