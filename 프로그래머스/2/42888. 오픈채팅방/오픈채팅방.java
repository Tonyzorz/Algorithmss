import java.util.*;

class Solution {
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
}