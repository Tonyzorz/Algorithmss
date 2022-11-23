package baekjoon.단계별.큐덱.프린터큐;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    
    public static class OrderSet {
        private int importance;
        private int index;

        public OrderSet(int importance, int index) {
            this.importance = importance;
            this.index = index;
        }

        public int getImportance() {
            return importance;
        }

        public void setImportance(int importance) {
            this.importance = importance;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        for (int i = 0; i < repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());

            // importance, index
            LinkedList<OrderSet> queue = new LinkedList<>();
            // importance list 
            LinkedList<Integer> importanceList = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < size; j++) {
                int importance = Integer.parseInt(st.nextToken());
                queue.add(new OrderSet(importance, j));
                importanceList.add(importance);
            }

            Collections.sort(importanceList, Collections.reverseOrder());
            
            int place = 1;
            Integer importance = importanceList.poll();
            while (!queue.isEmpty()) {

                OrderSet poll = queue.poll();
                if (poll.importance == importance) {
                    
                    if (poll.index == index) {
                        bw.write(place + "\n");
                        break;
                    }
                    
                    place++;
                    importance = importanceList.poll();
                } else {
                    queue.add(poll);
                }
            }
        }
        
        br.close();
        bw.close();
    }

}
