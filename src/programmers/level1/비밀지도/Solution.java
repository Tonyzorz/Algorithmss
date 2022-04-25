package programmers.level1.비밀지도;

import java.util.Arrays;

public class Solution {

    /*
[1차] 비밀지도
문제 설명
비밀지도
네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다. 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.

지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
"지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
secret map

네오가 프로도의 비상금을 손에 넣을 수 있도록, 비밀지도의 암호를 해독하는 작업을 도와줄 프로그램을 작성하라.

입력 형식
입력으로 지도의 한 변 크기 n 과 2개의 정수 배열 arr1, arr2가 들어온다.

1 ≦ n ≦ 16
arr1, arr2는 길이 n인 정수 배열로 주어진다.
정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 n 이하이다. 즉, 0 ≦ x ≦ 2n - 1을 만족한다.
출력 형식
원래의 비밀지도를 해독하여 '#', 공백으로 구성된 문자열 배열로 출력하라.

입출력 예제
매개변수	값
n	5
arr1	[9, 20, 28, 18, 11]
arr2	[30, 1, 21, 17, 28]
출력	["#####","# # #", "### #", "# ##", "#####"]
매개변수	값
n	6
arr1	[46, 33, 33 ,22, 31, 50]
arr2	[27 ,56, 19, 14, 14, 10]
출력	["######", "### #", "## ##", " #### ", " #####", "### # "]
     */

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binaryArr1 = new String[n];
        String[] binaryArr2 = new String[n];

        //convert number to binary
        for (int i = 0; i < n; i++) {
            binaryArr1[i] = convertToBinary(arr1[i], n);
            binaryArr2[i] = convertToBinary(arr2[i], n);
        }

        //merge two binary to form a map
        for (int i = 0; i < n; i++) {
            String binary1 = binaryArr1[i];
            String binary2 = binaryArr2[i];

            answer[i] = makeMap(binary1, binary2);
        }

        return answer;
    }

    public String convertToBinary(int number, int n) {
        StringBuilder sb = new StringBuilder();

        while (number > 0) {
            sb.append(number % 2);
            number /= 2;
        }

        if (sb.length() < n) {
            int repeat = n - sb.length();

            for (int i = 0; i < repeat; i++) {
                sb.append("0");
            }
        }

        return sb.reverse().toString();
    }

    public String makeMap(String binary1, String binary2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < binary1.length(); i++) {
            if (binary1.charAt(i) == '1' || binary2.charAt(i) == '1') {
                sb.append("#");
            } else {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(solution.solution(n, arr1, arr2)));
    }
}
