package baekjoon.단계별.집합과맵.문자열집합;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> set = new HashSet<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            set.add(word);
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            String word = br.readLine();
            if (set.contains(word)) {
                cnt++;
            }
        }

        bw.write(cnt + "");
        br.close();
        bw.close();
    }

}
