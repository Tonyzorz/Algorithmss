package baekjoon.단계별.함수.정수N개의합;

import java.io.*;
import java.util.StringTokenizer;

public class Test {
    
    public long sum(int[] a) {

        long answer = 0;

        for (int num : a) {
            answer += num;
        }

        return answer;
    }

}
