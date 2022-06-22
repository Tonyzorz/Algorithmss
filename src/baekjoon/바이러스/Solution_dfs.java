package baekjoon.바이러스;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_dfs {
    
    int node[][];
    int check[];
    int answer = 0;
    public int solution(int computers, int[][] graph) {
        setNode(computers, graph);

        for (int[] ints : node) {
            System.out.println(Arrays.toString(ints));
        }
        
        dfs(1);
        return answer - 1;
    }
    
    
    public void dfs(int x) {
        if (check[x] == 1) return;
        
        check[x] = 1;
        answer++;
        
        for (int i = 1; i < node.length; i++) {
            if (node[x][i] == 1 && check[i] != 1) {
                dfs(i);
            }
        }
    }
    
    public void setNode(int computers, int[][] graph) {
        node = new int[computers + 1][computers + 1];
        check = new int[computers + 1];
        
        for (int i = 0; i < graph.length; i++) {
            int a = graph[i][0];
            int b = graph[i][1];
            
            node[a][b] = 1;
            node[b][a] = 1;
        }
    }
    
    @Test
    public void answer() {
        //given
        int computers = 7;
        int[][] graph = {{1,2},
                {2,3},
                {1,5},
                {5,2},
                {5,6},
                {4,7},};
        
        //when
        int result = 4;
        
        //then
        Assert.assertEquals(result, solution(computers, graph));
    }
}
