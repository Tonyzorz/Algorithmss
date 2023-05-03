package baekjoon.단계별.그래프와순회.DFS와BFS;

import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static String dfsAnswer = "";
    public static String bfsAnswer = "";
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int nodeCnt = Integer.parseInt(st.nextToken());
        int edgeCnt = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= nodeCnt; i++) {
            graph.add(new ArrayList<>());
        }

        visited = new boolean[nodeCnt + 1];

        for (int i = 0; i < edgeCnt; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }
        
        dfsAnswer += start + " ";
        visited[start] = true;
        dfs(start);

        Arrays.fill(visited, false);

        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        visited[start] = true;
        bfsAnswer += start + " ";
        queue.add(graph.get(start));
        
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = queue.poll();

            for (int num : list) {
                if (!visited[num]) {
                    visited[num] = true;
                    queue.add(graph.get(num));
                    bfsAnswer += num + " ";
                }
            }
        }
        
        bw.write(dfsAnswer + "\n" + bfsAnswer);
        br.close();
        bw.close();
    }
    
    public static void dfs(int start) {
        for (int num : graph.get(start)) {
            if (!visited[num]) {
                visited[num] = true;
                dfsAnswer += num + " ";
                dfs(num);
            }
        }
    }

}
