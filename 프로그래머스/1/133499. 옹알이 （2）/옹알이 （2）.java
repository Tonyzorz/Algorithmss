class Solution {
        public int solution(String[] babbling) {
        int answer = 0;

        String[] ableSound = {"aya", "ye", "woo", "ma"};
        String[] repeatSound = {"ayaaya", "yeye", "woowoo", "mama"};
        for (String word : babbling) {

            for (int i = 0; i < ableSound.length; i++) {
                boolean isRepeat = false;

                if (word.contains(repeatSound[i])) {
                    isRepeat = true;
                }

                word = (isRepeat) ? word.replaceFirst(ableSound[i], " ")
                        : word.replace(ableSound[i], " ");

            }


            word = word.replaceAll(" ", "");
            if (word.length() == 0) {
                answer++;
            }
        }

        return answer;
    }
}