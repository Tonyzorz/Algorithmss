package baekjoon.단계별.백트래킹.N과M_2;

import java.io.*;
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

        recursive(num, size, 1, 0);
        /*
        bw.write();
         */
        br.close();
        bw.close();
    }

    public static void recursive(int num, int size, int current, int depth) {

        if (depth == size) {
            for (int n : nums) {
                System.out.print(n + " ");
            }
            System.out.println();
            return;
        }

        for (int i = current; i <= num; i++) {
//            System.out.println(i);
            nums[depth] = i;
            recursive(num, size, i + 1, depth + 1);
        }
    }

}
