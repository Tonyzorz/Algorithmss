import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int cnt = 0;
        int answer = 0;

        for (int i = 666; i < Integer.MAX_VALUE; i++) {
            if ( String.valueOf(i).contains("666") ) {
                cnt++;
            }

            if (cnt == num) {
                answer = i;
                break;
            }
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}