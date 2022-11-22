package baekjoon.단계별.큐덱.Router;

import java.io.*;
import java.util.LinkedList;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Integer> queue = new LinkedList<>();
        int size = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        
        while (num > -1) {
            
            if (num == 0) {
                queue.poll();
            } else if (queue.size() != size) {
                queue.add(num);
            }
            
            num = Integer.parseInt(br.readLine());
        }
        
        if (queue.isEmpty()) {
            bw.write("empty");
            bw.close();
            return;
        }
        
        for (int i = 0; i < queue.size(); i++) {
            bw.write(queue.get(i) + " ");
        }
        
        br.close();
        bw.close();
    }

}
