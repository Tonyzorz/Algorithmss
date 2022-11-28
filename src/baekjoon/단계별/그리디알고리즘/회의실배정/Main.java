package baekjoon.단계별.그리디알고리즘.회의실배정;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    
    public static class Point {
        private int start;
        private int end;

        public Point(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        ArrayList<Point> list = new ArrayList<>();
        
        StringTokenizer st = null;
        int maxSize = 0;
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            maxSize = Math.max(maxSize, end);
            
            list.add(new Point(start, end));
        }
        
        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int end1 = o1.getEnd();
                int end2 = o2.getEnd();

                if (end1 == end2) {
                    int start1 = o1.getStart();
                    int start2 = o2.getStart();

                    return start1 - start2;
                }

                return end1 - end2;
            }
        });
        
        int count = 0;
        int prevTime = 0;
        for (int i = 0; i < list.size(); i++) {
            Point point = list.get(i);
            
            if (prevTime <= point.getStart()) {
                prevTime = point.getEnd();
                count++;
            }
        }
        
        bw.write(count + "");
        br.close();
        bw.close();
    }

}
