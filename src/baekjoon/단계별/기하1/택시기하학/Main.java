package baekjoon.단계별.기하1.택시기하학;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int radius = Integer.parseInt(br.readLine());

        double first = Math.pow(radius, 2) * Math.PI;
        double second = Math.pow(radius, 2) * 2;

        System.out.printf("%.6f \n", first);
        System.out.printf("%.6f", second);
        /*
        bw.write();
         */
        br.close();
        bw.close();
    }

}
