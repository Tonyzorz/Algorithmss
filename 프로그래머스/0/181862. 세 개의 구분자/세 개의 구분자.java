import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] array = Arrays.stream(myStr.replaceAll("[a-c]", " ").split(" ")).filter(s -> !s.isEmpty()).toArray(String[]::new);
        return (array.length == 0) ? new String[]{"EMPTY"} : array;
    }
}