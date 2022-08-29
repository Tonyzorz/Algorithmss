package baekjoon.단계별.기본수학1.ACM호텔;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iteration = Integer.parseInt(br.readLine());
        for (int i = 0; i < iteration; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int place = Integer.parseInt(st.nextToken());
            
            int front = place % h;
            int back = (int) Math.ceil((double)place / h);
            
            if (front == 0) {
                bw.write(h + "");
            } else {
                bw.write(front + "");
            }
            
            if (back < 10) {
                bw.write("0");
            }
            
            bw.write(back + "\n");
        }
        
        bw.write("");
        br.close();
        bw.close();
    }

}
