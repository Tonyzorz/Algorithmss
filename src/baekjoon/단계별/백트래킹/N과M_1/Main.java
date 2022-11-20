package baekjoon.단계별.백트래킹.N과M_1;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static int[] nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());

        visited = new boolean[num + 1];
        nums = new int[size];

        recursive(num, size, 0);
        /*
        bw.write();
         */
        br.close();
        bw.close();
    }

    public static void recursive(int num, int size, int index) {

        if (index == size) {
            for (int n : nums) {
                System.out.print(n + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= num; i++) {
            if (!visited[i]) {
                visited[i] = true;
                nums[index] = i;
                recursive(num, size, index + 1);
                visited[i] = false;
            }
        }
    }

}
