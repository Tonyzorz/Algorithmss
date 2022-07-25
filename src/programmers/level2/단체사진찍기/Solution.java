package programmers.level2.단체사진찍기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    String[] friends;
    boolean[] visited;
    private int answer = 0;
    String[] data;
    
    public int solution(int n, String[] data) {
        this.data = data;
        answer = 0;
        friends = new String[]{"A", "C", "F", "J", "M", "N", "R", "T"};
        visited = new boolean[8];
        dfs("");
        return answer;
    }
    
    public void dfs(String names) {

        if (names.length() == 7) {
            if (check(names)) {
                answer++;
            }
            return;
        }
        
        for (int i = 0; i < friends.length; i++) {
            
            if (!visited[i]) {
                visited[i] = true;
                
                String name = names + friends[i];
                dfs(name);
                
                visited[i] = false;
            }
        }
    }
    
    public boolean check(String names) {

        // "N~F=0", "R~T>2"
        // "M~C<2", "C~M>1"
        for (String datum : data) {
            String[] split = datum.split("");
            int firstPerson = names.indexOf(split[0]);
            int secondPerson = names.indexOf(split[2]);
            int need = Integer.parseInt(split[4]) + 1;
            
            switch (split[3]) {
                case "=":
                    if (!(Math.abs(firstPerson - secondPerson) == need)) {
                        return false;
                    }
                    break;
                case ">":
                    if (!(Math.abs(firstPerson - secondPerson) > need)) {
                        return false;
                    }
                    break;
                case "<":
                    if (!(Math.abs(firstPerson - secondPerson) < need)) {
                        return false;
                    }
                    break;
            }
            
        }

        return true;
    }
    
    @Test
    public void answer() {
        //given
        int n1 = 2;
        int n2 = 2;
        
        String[] data1 = {"N~F=0", "R~T>2"};
        String[] data2 = {"M~C<2", "C~M>1"};
        
        //when
        int answer1 = 3648;
        int answer2 = 0;
        
        //then
        Assert.assertEquals(answer1, solution(n1, data1));
//        Assert.assertEquals(answer2, solution(n2, data2));
    }
}
