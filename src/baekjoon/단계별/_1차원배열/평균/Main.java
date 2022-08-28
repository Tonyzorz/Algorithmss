package baekjoon.단계별._1차원배열.평균;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> grades = new ArrayList<>();

        double max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int grade = Integer.parseInt(st.nextToken());
            grades.add(grade);

            max = Math.max(max, grade);
        }

        double avg = 0;
        for (int i = 0; i < size; i++) {
            avg += (grades.get(i) / max) * 100;
        }

        avg /= size;

        bw.write(avg + "");
        br.close();
        bw.close();
    }

}
