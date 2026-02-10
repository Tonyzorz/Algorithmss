
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == -1) {
                break;
            }

            StringBuffer sb = new StringBuffer();
            sb.append(num + " = ");
            ArrayList<Integer> factors = new ArrayList<Integer>();
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    factors.add(i);
                    sb.append(i + " + ");
                }
            }
            sb.replace(sb.length() - 2, sb.length(), "");

            Collections.sort(factors);
            int sumNum = 0;
            for (int i = 0; i < factors.size(); i++) {
                Integer factor = factors.get(i);
                sumNum += factor;
            }

            String answer = (sumNum == num) ? sb.toString() : num + " is NOT perfect.";
            bw.write(answer + "\n");
        }

        bw.flush();
        bw.close();
    }
}