package programmers.level3.N으로표현;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution_dp {

//    public int solution(int N, int number) {
//        HashSet<Integer> set = new HashSet<>();
//        
//        int total = N;
//        set.add(total);
//        for (int i = 2; i <= 8; i++) {
//            
//            HashSet<Integer> newSet = new HashSet<>();
//            for (int num : set) {
//                newSet.add(num + N);
//                newSet.add(num * N);
//                newSet.add(num / N);
//                newSet.add(num - N);
//            }
//            
//            set = newSet;
//            set.remove(total);
//            
//            total = total * 10 + N;
//            set.add(total);
//            
//            for (int num : set) {
//                if (num == number) {
//                    return i;
//                }
//            }
//
//
//        }
//        
//        return -1;
//    }
    
    public int solution(int N, int number) {
        
        List<HashSet<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(new HashSet<>());
        }
        
        list.get(1).add(N);
        
        int totalN = N;
        for (int i = 2; i <= 8; i++) {

            HashSet<Integer> set = list.get(i);
            
            for (int j = 1; j < i; j++) {
                HashSet<Integer> preSet = list.get(j);
                HashSet<Integer> postSet = list.get(i - j);
                
                for (int preNum : preSet) {
                    for (int postNum : postSet) {
                        set.add(preNum + postNum);
                        set.add(preNum * postNum);
                        set.add(preNum - postNum);
                        
                        if (preNum != 0 && postNum != 0) {
                            set.add(preNum / postNum);
                        }
                    }
                }
            }
            totalN = totalN * 10 + N;
            set.add(totalN);
            list.set(i, set);
        
            for (int num : set) {
                if (num == number) {
                    return i;
                }
            }
        }
        
        
        
        
        return -1;
    }
    
    @Test
    public void answer() {
        //given
        int N1 = 5;
        int N2 = 2;
        int N3 = 4;
        int N4 = 8;
        
        int number1 = 12;
        int number2 = 11;
        int number3 = 31;
        int number4 = 5800;
        
        //when
        int answer1 = 4;
        int answer2 = 3;
        int answer3 = 3;
        int answer4 = 8;
        
        //then
        Assert.assertEquals(answer1, solution(N1, number1));
        Assert.assertEquals(answer2, solution(N2, number2));
        Assert.assertEquals(answer3, solution(N3, number3));
        Assert.assertEquals(answer4, solution(N4, number4));
    }
}
