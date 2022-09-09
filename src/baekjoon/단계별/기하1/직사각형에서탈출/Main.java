package baekjoon.단계별.기하1.직사각형에서탈출;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int minX = Math.min((Math.abs(x - 0)), Math.abs(x - w));
        int minY = Math.min(Math.abs(y - 0), Math.abs(h - y));

        int min = Math.min(minX, minY);

        bw.write(min + "");
        br.close();
        bw.close();
    }

}
