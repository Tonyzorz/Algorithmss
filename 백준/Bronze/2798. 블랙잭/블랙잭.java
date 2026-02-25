import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] cards;
    static int max = 0;
    static int goal;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cardCnt = Integer.parseInt(st.nextToken());
        goal = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        cards = new int[cardCnt];
        for (int i = 0; i < cardCnt; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        // Arrays.sort(cards);


        for (int i = 0; i < cardCnt; i++) {
            recursive(0, i, cards[i]);
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
    }

    public static void recursive(int cnt, int idx, int total) {
        
        if (cnt == 2) {

            if (total > max) {
                max = total;
            }

            return;
        }


        for (int i = idx + 1; i < cards.length; i++) {
            int tempTotal = total;
            tempTotal += cards[i];

            if (tempTotal > goal) {
                continue;
            }

            recursive(cnt + 1, i, tempTotal);
        }
    }
}