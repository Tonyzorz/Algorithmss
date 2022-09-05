package baekjoon.단계별.정렬.커트라인;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> scores = new ArrayList<>();
        while (st.hasMoreTokens()) {
            int score = Integer.parseInt(st.nextToken());
            scores.add(score);
        }

        Collections.sort(scores, Collections.reverseOrder());

        bw.write(scores.get(cut - 1) + "");
        br.close();
        bw.close();
    }

}
