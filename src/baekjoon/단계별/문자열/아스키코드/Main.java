package baekjoon.단계별.문자열.아스키코드;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        char ch = st.nextToken().charAt(0);
        bw.write((int) ch + "");
        br.close();
        bw.close();
    }

}
