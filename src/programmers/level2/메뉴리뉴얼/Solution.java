package programmers.level2.메뉴리뉴얼;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution {

    public String[] solution(String[] orders, int[] course) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int size : course) {
            for (String order : orders) {

                String[] orderSplit = order.split("");

/*                for (int i = 0; i < orderSplit.length; i++) {
                    String combination = orderSplit[i];
                    for (int j = i + 1; j < orderSplit.length; j++) {
                        combination += orderSplit[j];
                        if (combination.length() == size) {
                            Integer num = map.getOrDefault(combination, 0);
                            map.put(combination, ++num);
                            combination = combination.substring(0, size - 1);
                        }
                    }
                }*/
                boolean[] visited = new boolean[orderSplit.length];
                for (int i = 0; i < orderSplit.length; i++) {
                    visited[i] = true;
                    combination(orderSplit, size, 1, visited, orderSplit[i], map);
                }
            }
        }

        HashMap<Integer, ArrayList<String>> nMap = new HashMap<>();
        int[] check = new int[11];
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String combination = entry.getKey();
            Integer num = entry.getValue();
            if (num == 1) {
                continue;
            }

            int length = combination.length();

            if (check[length] < num) {
                check[length] = num;
                ArrayList<String> words = new ArrayList<>();
                words.add(combination);
                nMap.put(length, words);
                continue;
            }

            if (check[length] == num) {
                ArrayList<String> words = nMap.getOrDefault(length, new ArrayList<>());
                words.add(combination);
                nMap.put(length, words);
                continue;
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for (Integer length : nMap.keySet()) {
            for (String word : nMap.get(length)) {
                list.add(word);
            }
        }


        Collections.sort(list);
        String[] answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public void combination(String[] word, int size, int index, boolean[] visited, String newWord, HashMap<String, Integer> map) {
        if (newWord.length() == size) {
            Integer num = map.getOrDefault(newWord, 0);
            char[] chars = newWord.toCharArray();
            Arrays.sort(chars);
            newWord = new String(chars);
            map.put(newWord, ++num);
        }

        for (int i = index; i < word.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combination(word, size, index +1, visited, newWord + word[i], map);
                visited[i] = false;
            }
        }

    }

    @Test
    public void answer() {
        //given
        String[] orders1 = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        String[] orders2 = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        String[] orders3 = {"XYZ", "XWY", "WXA"};

        int[] course1 = {2,3,4};
        int[] course2 = {2,3,5};
        int[] course3 = {2,3,4};

        //when
        String[] answer1 = {"AC", "ACDE", "BCFG", "CDE"};
        String[] answer2 = {"ACD", "AD", "ADE", "CD", "XYZ"};
        String[] answer3 = {"WX", "XY"};

        //then
        Assert.assertArrayEquals(answer1, solution(orders1, course1));
//        Assert.assertArrayEquals(answer2, solution(orders2, course2));
//        Assert.assertArrayEquals(answer3, solution(orders3, course3));
    }
}
