package baekjoon.단계별.그래프와순회.뱀과사다리게임;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int ladderCnt = Integer.parseInt(st.nextToken());
        int snakeCnt = Integer.parseInt(st.nextToken());

        int[] board = new int[101];
        for (int i = 1; i < board.length; i++) {
            board[i] = i;
        }

        for (int i = 0; i < ladderCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            board[x] = y;
        }

        for (int i = 0; i < snakeCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            board[x] = y;
        }

        int[] check = new int[101];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        
        int min = 0;
        while (!queue.isEmpty()) {
            Integer curNum = queue.poll();

            for (int i = 1; i <= 6; i++) {
                int nextNum = curNum + i;

                if (nextNum > 100) {
                    continue;
                }
                
                if (check[board[nextNum]] == 0) {
                    queue.offer(board[nextNum]);
                    check[board[nextNum]] = check[curNum] + 1;
                }
                
                if (board[nextNum] == 100) {
                    min = check[100];
                    break;
                }
            }
        }
        
        bw.write(min + "");
        br.close();
        bw.close();
    }

}
