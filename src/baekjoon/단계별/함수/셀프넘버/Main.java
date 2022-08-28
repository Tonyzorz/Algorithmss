package baekjoon.단계별.함수.셀프넘버;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean[] isSelfNum = new boolean[10000];
        Arrays.fill(isSelfNum, true);

        for (int i = 1; i < 10000; i++) {
            isSelfNum[notSelfNum(i)] = false;
        }

        for (int i = 1; i < isSelfNum.length; i++) {
            if (isSelfNum[i]) {
                bw.write((i) + "\n");
            }
        }
        br.close();
        bw.close();
    }

    public static int notSelfNum(int n) {
        int selfNum = n;

        while (n > 0) {
            selfNum += n % 10;
            n /= 10;
        }

        if (selfNum > 9999) {
            return 9999;
        }

        return selfNum;
    }

}
