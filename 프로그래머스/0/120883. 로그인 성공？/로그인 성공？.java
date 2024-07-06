import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> map = new HashMap<>();
        for (String[] data : db) {
            map.put(data[0], data[1]);
        }
        
        if (!map.containsKey(id_pw[0])) return "fail";

        String pass = map.get(id_pw[0]);
        if (!pass.equals(id_pw[1])) return "wrong pw";
        
        return "login";
    }
}