package baekjoon.단계별.재귀.재귀함수가뭔가요;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iteration = Integer.parseInt(br.readLine());
        List<String> backward = new ArrayList<>();
        List<String> forward = new ArrayList<>();

        recursive(iteration, 0, "", backward, forward);

        StringBuilder sb = new StringBuilder();
        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        for (String str : forward) {
            sb.append(str + "\n");
        }

        for (int i = backward.size() - 1; i >= 0; i--) {
            sb.append(backward.get(i) + "\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static void recursive(int index, int num, String underline, List<String> backward, List<String> forward) {

        backward.add(underline + "라고 답변하였지.");

        if (index == num) {
            forward.add(underline + "\"재귀함수가 뭔가요?\"");
            forward.add(underline + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            return;
        }

        forward.add(underline + "\"재귀함수가 뭔가요?\"");
        forward.add(underline + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        forward.add(underline + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        forward.add(underline + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

        underline += "____";
        num++;
        recursive(index, num, underline, backward, forward);
    }

}
