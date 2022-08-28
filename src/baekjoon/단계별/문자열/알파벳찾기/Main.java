package baekjoon.단계별.문자열.알파벳찾기;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        String[] split = st.nextToken().split("");
        for (int i = 0; i < split.length; i++) {
            int index = split[i].charAt(0) - 'a';

            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : alphabet) {
            sb.append(num + " ");
        }

        bw.write(sb.toString().trim());
        br.close();
        bw.close();
    }

}
