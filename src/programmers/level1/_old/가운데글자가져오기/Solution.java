package programmers.level1._old.가운데글자가져오기;

public class Solution {

    /*
    가운데 글자 가져오기
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
"abcde"	"c"
"qwer"	"we"
     */
    public String solution(String s) {
        int length = s.length();
        String answer = (length % 2 == 0) ? s.substring(length / 2 - 1, length / 2 + 1): s.substring(length / 2, length / 2 + 1);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "qwerz";
        System.out.println(solution.solution(s));
    }
}
