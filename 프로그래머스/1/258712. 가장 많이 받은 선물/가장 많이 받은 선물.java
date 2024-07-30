import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        HashMap<String, Integer> giftSendIndex = new HashMap<>();
        HashMap<String, Integer> giftReceiveIndex = new HashMap<>();
        HashMap<String, Integer> giftHistory = new HashMap<>();

        for (String gift : gifts) {
            String[] giftInfo = gift.split(" ");

            String giftFrom = giftInfo[0];
            String giftTo = giftInfo[1];

            int idxCnt = giftSendIndex.getOrDefault(giftFrom, 0) + 1;
            giftSendIndex.put(giftFrom, idxCnt);

            idxCnt = giftReceiveIndex.getOrDefault(giftTo, 0) + 1;
            giftReceiveIndex.put(giftTo, idxCnt);

            int historyCnt = giftHistory.getOrDefault(gift, 0) + 1;
            giftHistory.put(gift, historyCnt);
        }

        for (String friendFrom : friends) {
            int willReceive = 0;

            for (String friendTo : friends) {
                if (friendFrom.equals(friendTo)) continue;

                String key1 = friendFrom + " " + friendTo;
                String key2 = friendTo + " " + friendFrom;

                int sendCnt = giftHistory.getOrDefault(key1, 0);
                int receiveCnt = giftHistory.getOrDefault(key2, 0);

                if (sendCnt > receiveCnt) {
                    willReceive++;

                } else if (sendCnt == receiveCnt) {
                    int oneIdx = giftSendIndex.getOrDefault(friendFrom, 0) - giftReceiveIndex.getOrDefault(friendFrom, 0);
                    int twoIdx = giftSendIndex.getOrDefault(friendTo, 0) - giftReceiveIndex.getOrDefault(friendTo, 0);

                    if (oneIdx > twoIdx) {
                        willReceive++;
                    }
                }

            }

            answer = Math.max(answer, willReceive);
        }

        return answer;
    }
}