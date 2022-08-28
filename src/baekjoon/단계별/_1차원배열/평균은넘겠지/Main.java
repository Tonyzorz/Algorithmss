package baekjoon.단계별._1차원배열.평균은넘겠지;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int iteration = Integer.parseInt(st.nextToken());

        for (int i = 0; i < iteration; i++) {
            st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken());
            ArrayList<Integer> grades = new ArrayList<>();
            double avg = 0;

            while (st.hasMoreTokens()) {
                int grade = Integer.parseInt(st.nextToken());
                grades.add(grade);
                avg += grade;
            }

            avg /= students;

            int overAvg = 0;
            for (int grade : grades) {
                if (grade > avg) {
                    overAvg++;
                }
            }

            double avgPercentage = (overAvg / (double) students) * 100;

            bw.write(String.format("%.3f", avgPercentage) + "%" + "\n");
        }

        br.close();
        bw.close();
    }

}
