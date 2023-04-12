package programmers.bfs_dfs.word_change;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    int answer = Integer.MAX_VALUE;
    public int solution(String begin, String target, String[] words) {

        boolean[] visited = new boolean[words.length];
        dfs(begin, target, words, 0, visited);
        
        if (answer == Integer.MAX_VALUE) {
            return 0;
        }
        
        return answer;
    }

    public void dfs(String currentWord, String target, String[] words, int count, boolean[] visited) {
        if (currentWord.equals(target)) {
            answer = Math.min(answer, count);    
            return;
        }
        
        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }
            
            if (!isChangeable(words[i], currentWord)) {
                continue;
            }
            
            visited[i] = true;
            dfs(words[i], target, words, count + 1, visited);
            visited[i] = false;
        }
        
    }
    
    public boolean isChangeable(String word1, String word2) {
        int count = 0;

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                count++;
            }
        }
        
        return (count <= 1) ? true : false;
    }
    
    @Test
    public void answer() {
        //given
        String begin1 = "hit";
        String begin2 = "hit";

        String target1 = "cog";
        String target2 = "cog";
        
        String[] words1 = {"hot", "dot", "dog", "lot", "log", "cog"};
        String[] words2 = {"hot", "dot", "dog", "lot", "log"};
        
        //when
        int answer1 = 4;
        int answer2 = 0;
        
        //then
        Assert.assertEquals(answer1, solution(begin1, target1, words1));
//        Assert.assertEquals(answer2, solution(begin2, target2, words2));
    }
}
