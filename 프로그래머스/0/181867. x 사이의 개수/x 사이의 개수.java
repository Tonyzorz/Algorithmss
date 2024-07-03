import java.util.*;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();

        for (String str : myString.split("x")) {
            list.add(str.length());
        }

        if (myString.charAt(myString.length() - 1) == 'x') {
            list.add(0);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}