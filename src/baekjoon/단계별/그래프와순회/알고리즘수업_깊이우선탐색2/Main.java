package baekjoon.단계별.그래프와순회.알고리즘수업_깊이우선탐색2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    
    public static boolean[] visited;
    public static int[] seq;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static int cnt = 2;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int vertexTotal = Integer.parseInt(st.nextToken());
        int edgeTotal = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        visited = new boolean[vertexTotal + 1];
        seq = new int[vertexTotal + 1];
        seq[startVertex] = 1; 
        visited[startVertex] = true;
        
        for (int i = 0; i <= vertexTotal; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < edgeTotal; i++) {
            st = new StringTokenizer(br.readLine());
            int edge1 = Integer.parseInt(st.nextToken());
            int edge2 = Integer.parseInt(st.nextToken());
            
            graph.get(edge1).add(edge2);
            graph.get(edge2).add(edge1);
        }

        for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        dfs(startVertex);
        
        for (int i = 1; i < seq.length; i++) {
            bw.write(seq[i] + "\n");
        }
        
        br.close();
        bw.close();
    }
    
    public static void dfs(int start) {
        for (int vertex : graph.get(start)) {
            if (!visited[vertex]) {
                seq[vertex] = cnt++;
                visited[vertex] = true;
                dfs(vertex);
            }
        }
    }

}
