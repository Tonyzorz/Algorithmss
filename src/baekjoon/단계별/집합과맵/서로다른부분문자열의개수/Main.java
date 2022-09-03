package baekjoon.단계별.집합과맵.서로다른부분문자열의개수;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < word.length() ; i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String substring = word.substring(i, j);
                set.add(substring);
            }
        }

        bw.write(set.size() + "");
        br.close();
        bw.close();
    }

}
