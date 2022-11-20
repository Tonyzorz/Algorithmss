package baekjoon.단계별.백트래킹.N과M_3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] nums;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());

        nums = new int[size];

        recursive(num, size, 0);
        /*
        bw.write();
         */
        br.close();
        bw.close();
    }

    public static void recursive(int num, int size, int depth) throws IOException {

        if (depth == size) {
            for (int n : nums) {
                bw.write(n + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 1; i <= num; i++) {
//            System.out.println(i);
            nums[depth] = i;
            recursive(num, size, depth + 1);
        }
    }

}
