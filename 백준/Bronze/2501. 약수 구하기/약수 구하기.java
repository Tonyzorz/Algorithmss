
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] info = br.readLine().split(" ");
        int num = Integer.parseInt(info[0]);
        int idx = Integer.parseInt(info[1]) - 1;

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }

        Collections.sort(factors);

        int answer = (factors.size() <= idx) ? 0 : factors.get(idx);

        bw.write(answer + "");
        bw.flush();
        bw.close();

    }
}