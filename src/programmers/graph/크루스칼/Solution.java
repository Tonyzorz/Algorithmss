package programmers.graph.크루스칼;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    
    public class Edge implements Comparable<Edge> {

        private int distance;
        private int nodeA;
        private int nodeB;

        public Edge(int distance, int nodeA, int nodeB) {
            this.distance = distance;
            this.nodeA = nodeA;
            this.nodeB = nodeB;
        }

        public int getDistance() {
            return distance;
        }

        public int getNodeA() {
            return nodeA;
        }

        public int getNodeB() {
            return nodeB;
        }

        @Override
        public int compareTo(Edge other) {
            return this.distance - other.distance;
        }
    }
    int[] parent = new int[8];

    /**
     * 1. 그래프의 간선 비용에 따라 오름차순으로 정렬
     * 2. 사이클이 발생하지 않으면 비용에 추가 
     */
    public int solution(int[][] graphs, int[] costs) {
        int answer = 0;

        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < graphs.length; i++) {
            edges.add(new Edge(costs[i], graphs[i][0], graphs[i][1]));
        }

        Collections.sort(edges);
        parent_init();
        
        for (int i = 0; i < edges.size(); i++) {
            int distance = edges.get(i).getDistance();
            int nodeA = edges.get(i).getNodeA();
            int nodeB = edges.get(i).getNodeB();
            
            if (findParent(nodeA) != findParent(nodeB)) {
                unionParent(nodeA, nodeB);
                answer += distance;
            }
        }
        
        return answer;
    }
    
    public void parent_init() {
        for (int i = 1; i < parent.length; i++) {
            parent[i] = i;
        }
    }
    
    public int findParent(int x) {
        if (x == parent[x]) return x;
        return parent[x] = findParent(parent[x]);
    }
    
    public void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }
    
    @Test
    public void answer() {
        //given
        int[][] graphs = {{1,2}, {1,5}, {2,3}, {2,6}, {3,4}, {4,6}, {4,7}, {5,6}, {6,7},};
        int[][] graphs2 = {{2,3}, {1,6}, {2,4}, {1,2}, {4,5}, {5,6}, {3,4}, {1,3}, {3,5},};
        
        int[] costs = {29, 75, 35, 34, 7, 23, 13, 53, 25};
        int[] costs2 = {3, 5, 6, 7, 7, 9, 10, 11, 15};
        
        //when
        int result = 159;
        int result2 = 28;
        
        //then
//        Assert.assertEquals(result, solution(graphs, costs));
        Assert.assertEquals(result2, solution(graphs2, costs2));
    }
}
