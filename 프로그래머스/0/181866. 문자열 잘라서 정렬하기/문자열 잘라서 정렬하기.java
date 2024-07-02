import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] strings = Arrays.stream(myString.split("x")).filter(str -> !str.isEmpty()).toArray(String[]::new);

        Arrays.sort(strings);

        return strings;
    }
}