package baekjoon.단계별.문자열.그룹단어체커;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int iteration = Integer.parseInt(st.nextToken());

        boolean[] alphabet = new boolean[26];
        int cnt = 0;

        for (int i = 0; i < iteration; i++) {

            String previous = "";
            boolean success = true;
            for (String letter : br.readLine().split("")) {
                if (previous.equals(letter)) {
                    continue;
                }
                previous = letter;

                int index = letter.charAt(0) - 'a';
                if (alphabet[index]) {
                    success = false;
                    break;
                }

                alphabet[index] = true;
            }

            if (success) {
                cnt++;
            }

            Arrays.fill(alphabet, false);
        }

        bw.write(cnt + "");
        br.close();
        bw.close();
    }

}
