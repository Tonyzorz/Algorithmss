package baekjoon.단계별.기하1.네번째점;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> setX = new HashSet<>();
        HashSet<Integer> setY = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (setX.contains(x)) {
                setX.remove(x);
            } else {
                setX.add(x);
            }

            if (setY.contains(y)) {
                setY.remove(y);
            } else {
                setY.add(y);
            }
        }

        for (int x : setX) {
            bw.write(x + " ");
        }

        for (int y : setY) {
            bw.write(y + "");
        }
        /*
        bw.write();
         */
        br.close();
        bw.close();
    }

}
