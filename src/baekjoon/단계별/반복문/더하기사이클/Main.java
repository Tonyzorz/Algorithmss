package baekjoon.단계별.반복문.더하기사이클;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int initial = Integer.parseInt(st.nextToken());
        int start = initial;
        int cnt = 0;

        while (true) {

            int ones = ((start / 10) + (start % 10)) % 10;
            int tens = (start % 10) * 10;

            start = tens + ones;

            cnt++;

            if (initial == start) {
                break;
            }
        }

        bw.write(cnt + "");
        br.close();
        bw.close();
    }

}
