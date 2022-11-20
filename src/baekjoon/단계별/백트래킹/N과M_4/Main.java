package baekjoon.단계별.백트래킹.N과M_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] nums;
    static int limit;
    static int size;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        limit = Integer.parseInt(st.nextToken());
        size = Integer.parseInt(st.nextToken());
        nums = new int[size];
        
        recursive(0, 1);
        br.close();
    }
    
    public static void recursive(int depth, int num) {
        if (depth >=  size) {
            for (int temp : nums) {
                System.out.print(temp + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i = num; i <= limit; i++) {
            nums[depth] = i;
            int newDepth = depth + 1;
            recursive(newDepth, i);
        }
    }

}
