
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Point> points = new ArrayList<Point>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new Point(x, y));
        }

        Collections.sort(points, new Comparator<Point>() {

            @Override
            public int compare(Point o1, Point o2) {
                if (o1.x == o2.x) {
                    return o1.y - o2.y;
                }

                return o1.x - o2.x;
            }
        });

        for (Point p : points) {
            bw.write(p.x + " " + p.y + "\n");
        }

        bw.flush();
        bw.close();
    }
}