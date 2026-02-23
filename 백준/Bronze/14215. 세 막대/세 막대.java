import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        int[] array = {x, y, z};
        Arrays.sort(array);

        x = array[0];
        y = array[1];
        z = array[2];

        int answer = (x + y > z) ? (x + y + z) : (2 * (x + y) - 1);

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}