package baekjoon.단계별.기하1.직각삼각형;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while (!(str = br.readLine().trim()).equals("0 0 0")) {
            String[] split = str.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int c = Integer.parseInt(split[2]);

            boolean isRight = false;
            if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
                isRight = true;
            } else if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) {
                isRight = true;
            } else if (Math.pow(a, 2) == Math.pow(c, 2) + Math.pow(b, 2)) {
                isRight = true;
            }

            if (isRight) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
        /*
        bw.write();
         */
        br.close();
        bw.close();
    }

}
