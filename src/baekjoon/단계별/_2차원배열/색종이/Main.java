package baekjoon.단계별._2차원배열.색종이;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[][] constructionPaper = new boolean[101][101];

        int repeat = Integer.parseInt(br.readLine());
        for (int i = 0; i < repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int iIndex = Integer.parseInt(st.nextToken());
            int jIndex = Integer.parseInt(st.nextToken());
            
            fillPaper(constructionPaper, iIndex, jIndex);
        }

        int count = countFilledPaper(constructionPaper);
        
        bw.write(count + "");
        br.close();
        bw.close();
    }
    
    public static void fillPaper(boolean[][] constructionPaper, int iIndex, int jIndex) {
        for (int i = iIndex; i < iIndex + 10; i++) {
            for (int j = jIndex; j < jIndex + 10; j++) {
                constructionPaper[i][j] = true;
            }
        }
    }
    
    public static int countFilledPaper(boolean[][] constructionPaper) {
        int count = 0;
        
        for (boolean[] booleans : constructionPaper) {
            for (boolean aBoolean : booleans) {
                if (aBoolean) count++;
            }
        }

        return count;
    }
        
}
