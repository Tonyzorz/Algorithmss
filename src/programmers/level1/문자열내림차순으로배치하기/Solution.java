package programmers.level1.문자열내림차순으로배치하기;

import java.util.*;

public class Solution {

    /*
    문자열 내림차순으로 배치하기
문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
s	return
"Zbcdefg"	"gfedcbZ"
     */
    public String solution(String s) {
        String[] letters = s.split("");
        Arrays.sort(letters, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (String letter : letters) {
            sb.append(letter);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Zbcdefg";
        System.out.println(solution.solution(s));
    }
}
