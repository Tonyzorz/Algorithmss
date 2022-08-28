package baekjoon.단계별.함수.한수;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        bw.write(arithmetic_sequence(Integer.parseInt(st.nextToken())) + "");
        br.close();
        bw.close();
    }

    public static int arithmetic_sequence(int num) {
        int cnt = 99;

        if (num < 100) {
            return num;
        }

        for (int i = 100; i <= num; i++) {
            int hun = i / 100;
            int ten = (i / 10) % 10;
            int one = i % 10;

            if ((hun - ten) == (ten - one)) {
                cnt++;
            }
        }

        return cnt;
    }

}
