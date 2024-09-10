class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};

        String color = board[h][w];
        for (int i = 0; i < 4; i++) {

            int nx = dx[i] + h;
            int ny = dy[i] + w;

            if (nx < 0 || ny < 0 || nx > board.length - 1 || ny > board.length - 1) {
                continue;
            }

            if (color.equals(board[nx][ny])) answer++;
        }

        return answer;
    }
}