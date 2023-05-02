package baekjoon.단계별.그래프와순회.알고리즘수업_너비우선탐색1;

import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean[] visited;
    public static int[] seq;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static int cnt = 2;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int vertexCnt = Integer.parseInt(st.nextToken());
        int edgeCnt = Integer.parseInt(st.nextToken());
        int root = Integer.parseInt(st.nextToken());

        visited = new boolean[vertexCnt + 1];
        seq = new int[vertexCnt + 1];
        
        for (int i = 0; i <= vertexCnt; i++) {
            graph.add(new ArrayList<>());
        }

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
        
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        queue.add(graph.get(root));
        visited[root] = true;
        seq[root] = 1;
        
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = queue.poll();

            for (int node : list) {
                if (!visited[node]) {
                    visited[node] = true;
                    seq[node] = cnt++;
                    queue.add(graph.get(node));
                }
            }
        }
        
        for (int i = 1; i < seq.length; i++) {
            bw.write(seq[i] + "\n");
        }
        
        br.close();
        bw.close();
    }

}
