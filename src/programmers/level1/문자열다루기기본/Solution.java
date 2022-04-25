package programmers.level1.문자열다루기기본;

public class Solution {

    /*
    문자열 다루기 기본
문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
입출력 예
s	return
"a234"	false
"1234"	true
     */
    public boolean solution(String s) {
        if (!checkLength(s)) return false;
        else if (!checkDigit(s)) return false;
        return true;
    }

    public boolean checkLength(String s) {
        return (s.length() == 4 || s.length() == 6) ? true : false;
    }

    public boolean checkDigit (String s) {

        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            if (ascii >= 48 && ascii <= 57) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "a234";
        System.out.println(solution.solution(s));
    }
}
