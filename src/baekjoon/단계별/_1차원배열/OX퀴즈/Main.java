package baekjoon.단계별._1차원배열.OX퀴즈;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int iteration = Integer.parseInt(st.nextToken());

        for (int i = 0; i < iteration; i++) {
            st = new StringTokenizer(br.readLine());
            String[] split = st.nextToken().split("");

            int repeated = 1;
            int score = 0;
            for (String letter : split) {
                if (letter.equalsIgnoreCase("o")) {
                    score += repeated++;
                }

                if (letter.equalsIgnoreCase("x")) {
                    repeated = 1;
                }
            }

            bw.write(score + "\n");
        }
        br.close();
        bw.close();
    }

}
