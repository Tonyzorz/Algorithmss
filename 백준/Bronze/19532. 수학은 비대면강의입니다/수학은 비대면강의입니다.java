import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int answerX = 0;
        int answerY = 0;
        outer: for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {

                int tempX = a * x + b * y;
                int tempY = d * x + e * y;

                if (tempX == c && tempY == f) {
                    answerX = x;
                    answerY = y;
                    break outer;
                }
            }
        }

        bw.write(answerX + " " + answerY);
        bw.flush();
        bw.close();
    }
}