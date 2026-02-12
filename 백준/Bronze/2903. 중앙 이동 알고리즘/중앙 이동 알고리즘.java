import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int answer = (int) Math.pow((Math.pow(2, num) + 1), 2);

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}