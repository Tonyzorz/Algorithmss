package baekjoon.단계별.정렬.좌표정렬하기2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static class Point implements Comparable<Point>{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (y == o.getY()) {
                return x - o.getX();
            }
            return y - o.getY();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iteration = Integer.parseInt(br.readLine());
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < iteration; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points.add(new Point(x, y));
        }

        Collections.sort(points);

        for (Point point : points) {
            bw.write(point.getX() + " " + point.getY() + "\n");
        }

        br.close();
        bw.close();
    }

}
