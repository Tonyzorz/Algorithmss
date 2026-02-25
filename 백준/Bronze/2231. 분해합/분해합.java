import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 1; i <= n; i++) {

            int total = i;
            int tempI = i;
            while (tempI > 0) {
                total += tempI % 10;
                tempI /= 10;
            }

            if (total == n) {
                answer = i;
                break;
            }
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}