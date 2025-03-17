
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    /**
     * 5
       20 10 35 30 7
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); // 5 ex. x00001

        int length = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()); // 20 10 35 30 7 ex. x00001

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            int num = Integer.parseInt(st.nextToken());

            min = Math.min(min, num); //2131212321312312, 20 ||||| // 20, 10 -> 10
            max = Math.max(max, num); //-12312312312323, 20 ||||| // 20, 10 -> 20

        }


        bw.write(min + " " + max);

        br.close();
        bw.close();
    }
}
