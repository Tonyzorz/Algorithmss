package programmers.level0.모스부호_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Solution {
    
    public String solution(String letter) {
        HashMap<String, String> map = new HashMap<>();
        String[] morse = new String[]{
                ".-,a","-...,b","-.-.,c","-..,d",".,e","..-.,f",
                "--.,g","....,h","..,i",".---,j","-.-,k",".-..,l",
                "--,m","-.,n","---,o",".--.,p","--.-,q",".-.,r",
                "...,s","-,t","..-,u","...-,v",".--,w","-..-,x",
                "-.--,y","--..,z"};
        for (int i = 0; i < morse.length; i++) {
            String[] split = morse[i].split(",");
            map.put(split[0], split[1]);
        }
        
        return Arrays.stream(letter.split(" "))
                .map(map::get)
                .collect(Collectors.joining());
    }

    @Test
    public void answer() {
        //given
        String letter1 = ".... . .-.. .-.. ---";
        String letter2 = ".--. -.-- - .... --- -.";
        
        //when
        String answer1 = "hello";
        String answer2 = "python";
        
        //then
        Assert.assertEquals(answer1, solution(letter1));
        Assert.assertEquals(answer2, solution(letter2));
    }
}
