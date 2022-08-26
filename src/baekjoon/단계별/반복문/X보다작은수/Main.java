package baekjoon.단계별.반복문.X보다작은수;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int iteration = Integer.parseInt(st.nextToken());
        int compare = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iteration; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            if (num < compare) {
                sb.append(num + " ");
            }
        }
        
        bw.write(sb.toString().trim());
        br.close();
        bw.close();
    }

}
