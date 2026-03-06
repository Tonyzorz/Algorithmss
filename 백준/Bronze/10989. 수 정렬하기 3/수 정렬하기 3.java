
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10001];
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num]++;
        }

        for (int i = 1; i <= 10000; i++) {

            int repeat = arr[i];
            for (int j = 0; j < repeat; j++) {
                bw.write(i + "\n");
            }
        }

        //bw.write("");
        bw.flush();
        bw.close();
    }
}