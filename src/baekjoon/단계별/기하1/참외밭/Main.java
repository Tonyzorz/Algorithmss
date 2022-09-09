package baekjoon.단계별.기하1.참외밭;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int amount = Integer.parseInt(br.readLine());

        // h = 4, 3
        // w = 2, 1
        int maxW = Integer.MIN_VALUE;
        int maxH = Integer.MIN_VALUE;

        int hMaxIdx = 0;
        int wMaxIdx = 0;
        int[] dist = new int[6];
        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int direction = Integer.parseInt(st.nextToken());
            int size = Integer.parseInt(st.nextToken());
            dist[i] = size;

            if (direction > 2) {
                if (maxH < size) {
                    maxH = Math.max(maxH, size);
                    hMaxIdx = i;
                }
            } else {
                if (maxW < size) {
                    maxW = Math.max(maxW, size);
                    wMaxIdx = i;
                }
            }
        }

        int box1 = maxW * maxH;
//        int box2 = minW * minH;
        int box2 = dist[(wMaxIdx + 3) % 6] * dist[(hMaxIdx + 3) % 6];

        int possible = (box1 - box2) * amount;
        bw.write(possible + "");
        br.close();
        bw.close();
    }

}
