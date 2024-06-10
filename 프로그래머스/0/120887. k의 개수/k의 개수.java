class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++) {
            char[] numArray = String.valueOf(num).toCharArray();

            for (int idx = 0; idx < numArray.length; idx++) {
                if ( numArray[idx] == String.valueOf(k).charAt(0) ) {
                    answer++;
                }
            }

        }

        return answer;
    }
}