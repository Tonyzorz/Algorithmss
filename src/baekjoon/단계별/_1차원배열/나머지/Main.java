package baekjoon.단계별._1차원배열.나머지;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = null;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken()) % 42;
            set.add(num);
        }

        bw.write(set.size() + "");
        br.close();
        bw.close();
    }

}
