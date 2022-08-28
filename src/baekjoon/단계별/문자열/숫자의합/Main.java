package baekjoon.단계별.문자열.숫자의합;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        st = new StringTokenizer(br.readLine());
        String[] split = st.nextToken().split("");

        int total = 0;
        for (String num : split) {
            total += Integer.parseInt(num);
        }

        bw.write(total + "");
        br.close();
        bw.close();
    }

}
