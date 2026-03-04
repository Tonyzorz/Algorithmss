import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static String[] chessBoardOne = {"B","W","B","W","B","W","B","W",};
    public static String[] chessBoardTwo = {"W","B","W","B","W","B","W","B"};

    public static String[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        board = new String[x][y];
        for (int i = 0; i < x; i++) {
            String[] split = br.readLine().split("");
            board[i] = split;
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i <= x - 8; i++) {
            for (int j = 0; j <= y - 8; j++) {

                int cnt = checkChessBoard(i, j);

                answer = Math.min(answer, cnt);

            }
        }



        bw.write(answer + "");
        bw.flush();
        bw.close();
    }

    public static int checkChessBoard(int startX, int startY) {

        int blackStartCnt = 0;
        int whiteStartCnt = 0;

        boolean switchColor = false;


        for (int x = startX; x < startX + 8; x++) {

            int idx = 0;
            for (int y = startY; y < startY + 8;) {

                if (switchColor) {
                    if ( !(board[x][y].equals(chessBoardTwo[idx])) ) {
                        blackStartCnt++;
                    }

                    if ( !(board[x][y].equals(chessBoardOne[idx])) ) {
                        whiteStartCnt++;
                    }
                } else {
                    if ( !(board[x][y].equals(chessBoardOne[idx])) ) {
                        blackStartCnt++;
                    }

                    if ( !(board[x][y].equals(chessBoardTwo[idx])) ) {
                        whiteStartCnt++;
                    }
                }
                idx++;
                y = y + 1;
            }

            switchColor = !switchColor;
        }

        return Math.min(blackStartCnt, whiteStartCnt);
    }
}