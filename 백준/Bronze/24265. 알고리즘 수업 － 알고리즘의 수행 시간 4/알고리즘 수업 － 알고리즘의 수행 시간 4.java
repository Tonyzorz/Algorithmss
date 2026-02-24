import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        long repeat = 0;
        for (int i = 1; i < n; i++) {
            repeat += i;
        }

        bw.write(repeat + "\n");
        bw.write(2 + "");
        bw.flush();
        bw.close();
    }
}