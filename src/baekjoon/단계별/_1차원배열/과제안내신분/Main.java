package baekjoon.단계별._1차원배열.과제안내신분;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] students = new boolean[31];
        for (int i = 0; i < 28; i++) {
            int student = Integer.parseInt(br.readLine());
            students[student] = true;
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < students.length; i++) {
            if (!students[i]) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }
        
        bw.write(min + "\n" + max);
        br.close();
        bw.close();
    }

}
