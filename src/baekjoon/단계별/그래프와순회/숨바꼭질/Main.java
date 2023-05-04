package baekjoon.단계별.그래프와순회.숨바꼭질;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int[] map = new int[100001];
        map[start] = 1;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        
        while (!queue.isEmpty()) {
            Integer idx = queue.poll();
            
            if (idx - 1 >= 0) {
                if (map[idx - 1] == 0) {
                    map[idx - 1] = map[idx] + 1;
                    queue.add(idx - 1);
                }
            }

            if (idx + 1 <= 100000) {
                if (map[idx + 1] == 0) {
                    map[idx + 1] = map[idx] + 1;
                    queue.add(idx + 1);
                }
            }

            if (idx * 2 <= 100000) {
                if (map[idx * 2] == 0) {
                    map[idx * 2] = map[idx] + 1;
                    queue.add(idx * 2);
                }
            }
        }
        
        
        bw.write(map[end] - 1 + "");
        br.close();
        bw.close();
    }

}
