package baekjoon.단계별.그래프와순회.바이러스;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static int cnt = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nodeCnt = Integer.parseInt(br.readLine());
        int edgeCnt = Integer.parseInt(br.readLine());

        visited = new boolean[nodeCnt + 1];
        for (int i = 0; i <= nodeCnt; i++) {
            graph.add(new ArrayList<>());
        }
        
        StringTokenizer st = null;
        for (int i = 0; i < edgeCnt; i++) {
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        visited[1] = true;
        queue.add(graph.get(1));
        
        while (!queue.isEmpty()) {

            ArrayList<Integer> list = queue.poll();
            
            for (int num : list) {
                if (!visited[num]) {
                    visited[num] = true;
                    cnt++;
                    queue.add(graph.get(num));
                }
            }
        }
        
        bw.write("" + cnt);
        br.close();
        bw.close();
    }

}
