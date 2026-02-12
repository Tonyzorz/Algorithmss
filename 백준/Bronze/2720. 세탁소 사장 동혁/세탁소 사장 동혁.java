import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] coins = new int[4];
        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            int change = Integer.parseInt(br.readLine());

            int remain = 0;

            remain = change % 25;
            coins[0] = change / 25;

            coins[1] = remain / 10;
            remain = remain % 10;

            coins[2] = remain / 5;
            remain = remain % 5;

            coins[3] = remain;

            for (int j = 0; j < coins.length; j++) {
                bw.write(coins[j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}