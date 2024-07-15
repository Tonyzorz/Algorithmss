class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray();
        for (int[] query : queries) {

            for (int i = 0; i < (query[1] - query[0] + 1) / 2; i++) {
                char temp = charArray[query[0] + i];
                charArray[query[0] + i] = charArray[query[1] - i];
                charArray[query[1] - i] = temp;
            }

        }

        return String.valueOf(charArray);
    }
}