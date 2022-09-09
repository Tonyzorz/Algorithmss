package baekjoon.단계별.정수론및조합론.배수와약수;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while (!(str = br.readLine().trim()).equals("0 0")) {
            StringTokenizer st = new StringTokenizer(str);
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if (first < second) {
                if (second % first == 0) {
                    bw.write("factor\n");
                } else {
                    bw.write("neither\n");
                }
            } else {
                if (first % second == 0) {
                    bw.write("multiple\n");
                } else {
                    bw.write("neither\n");
                }
            }

        }

        /*
        bw.write();
         */
        br.close();
        bw.close();
    }

}
