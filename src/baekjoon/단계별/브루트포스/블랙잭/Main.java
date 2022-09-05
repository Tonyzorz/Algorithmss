package baekjoon.단계별.브루트포스.블랙잭;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        int[] cards = new int[size];

        int index = 0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int card = Integer.parseInt(st.nextToken());
            cards[index++] = card;
        }

        int score = Integer.MIN_VALUE;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int h = j + 1; h < size; h++) {
                    int total = cards[i] + cards[j] + cards[h];
                    if (total <= max) {
                        score = Math.max(score, total);
                    }
                }
            }
        }

        bw.write(score + "");
        br.close();
        bw.close();
    }

}
