package programmers.level1.가장_많이_받은_선물;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class Solution {

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

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        String[] friends1 = {"muzi", "ryan", "frodo", "neo"};
        String[] friends2 = {"joy", "brad", "alessandro", "conan", "david"};
        String[] friends3 = {"a", "b", "c"};

        String[] gifts1 = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        String[] gifts2 = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        String[] gifts3 = {"a b", "b a", "c a", "a c", "a c", "c a"};

        //when
        int answer1 = 2;
        int answer2 = 4;
        int answer3 = 0;

        //then
        Assert.assertEquals(answer1, solution(friends1, gifts1));
        Assert.assertEquals(answer2, solution(friends2, gifts2));
        Assert.assertEquals(answer3, solution(friends3, gifts3));
    }
}
