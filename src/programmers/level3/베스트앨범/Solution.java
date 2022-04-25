package programmers.level3.베스트앨범;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution {

    public class Music implements Comparable<Music>{
        int index;
        int play;
        String genre;

        public Music(int index, int play, String genre) {
            this.index = index;
            this.play = play;
            this.genre = genre;
        }

        public int getIndex() {
            return index;
        }

        public int getPlay() {
            return play;
        }

        public String getGenre() {
            return genre;
        }

        @Override
        public int compareTo(Music o2) {

            int play2 = o2.getPlay();

            if (play > play2) {
                return -1;
            } else if (play < play2) {
                return 1;
            } else {

                int index2 = o2.getIndex();

                if (index > index2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        
        SortedMap<String, Integer> totalPlays = new TreeMap<>();
        Map<String, PriorityQueue<Music>> musics = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {

            String genre = genres[i];
            int play = plays[i];
            
            if (totalPlays.containsKey(genre)) {

                Integer total = totalPlays.get(genre) + play;
                totalPlays.put(genre, total);
                
            } else {
                
                totalPlays.put(genre, play);
            }

            PriorityQueue<Music> musicList;
            
            if (musics.containsKey(genre)) {
                musicList = musics.get(genre);

            } else {
                musicList = new PriorityQueue<>();
            }
            
            musicList.add(new Music(i, play, genre));
            musics.put(genre, musicList);
        }

        SortedMap<Integer, String> totalPlaysSorted = new TreeMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : totalPlays.entrySet()) {
            String genre = stringIntegerEntry.getKey();
            Integer play = stringIntegerEntry.getValue();
            totalPlaysSorted.put(play, genre);
        }

        int size = totalPlaysSorted.size();

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < size; i++) {

            Integer play = totalPlaysSorted.lastKey();
            String genre = totalPlaysSorted.get(play);
            totalPlaysSorted.remove(play);

            PriorityQueue<Music> music = musics.get(genre);

            int first = music.poll().getIndex();
            answer.add(first);

            if (music.size() >= 1) {
                int second = music.poll().getIndex();
                answer.add(second);
            }

        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
    
    @Test
    public void answer() {
        //given
        String[] genres1 = {"classic", "pop", "classic", "classic", "pop"};
        String[] genres2 = {"classic", "Newage", "pop", "classic", "classic", "pop", "Newage"};
        String[] genres3 = {"classic", "pop", "classic", "classic", "pop", "zazz", "zazz"};
        String[] genres4 = {"classic", "pop", "classic", "classic", "pop", "zazz", "zazz"};
        String[] genres5 = {"classic", "pop", "classic", "pop", "classic", "classic"};
        String[] genres6 = {"classic", "pop", "classic", "classic", "pop", "test"};
        String[] genres7 = {"pop", "pop", "pop", "rap", "rap"};
        String[] genres8 = {"classic", "pop", "classic", "pop", "classic", "classic"};
        String[] genres9 = {"a", "b", "b", "c", "c"};
        String[] genres10 = {"A", "B", "A", "B", "A", "C"};
        String[] genres11 = {"A", "A", "B", "A"};

        int[] plays1 = {500, 600, 150, 800, 2500};
        int[] plays2 = {500, 1700, 600, 150, 800, 2500, 1500};
        int[] plays3 = {500, 600, 150, 800, 2500, 2000, 6000};
        int[] plays4 = {500, 600, 150, 800, 2500, 2100, 1000};
        int[] plays5 = {1951, 600, 500, 2500, 500, 150};
        int[] plays6 = {500, 600, 150, 800, 2500, 100};
        int[] plays7 = {45, 50, 40, 60, 70};
        int[] plays8 = {400, 600, 150, 600, 500, 500};
        int[] plays9 = {5, 5, 40, 5, 5};
        int[] plays10 = {500, 600, 150, 800, 2500, 5000};
        int[] plays11 = {5, 5, 6, 5};

        //when
        int[] answer1 = {4, 1, 3, 0};
        int[] answer2 = {1, 6, 5, 2, 4, 0};
        int[] answer3 = {6, 5, 4, 1, 3, 0};
        int[] answer4 = {4, 1, 5, 6, 3, 0};
        int[] answer5 = {0, 2, 3, 1};
        int[] answer6 = {4, 1, 3, 0, 5};
        int[] answer7 = {1, 0, 4, 3};
        int[] answer8 = {4, 5, 1, 3};
        int[] answer9 = {2, 1, 3, 4, 0};
        int[] answer10 = {5, 4, 0, 3, 1};
        int[] answer11 = {0, 1, 2};

        //then
        Assert.assertArrayEquals(answer1, solution(genres1, plays1));
        Assert.assertArrayEquals(answer2, solution(genres2, plays2));
        Assert.assertArrayEquals(answer3, solution(genres3, plays3));
//        Assert.assertArrayEquals(answer4, solution(genres4, plays4));
        Assert.assertArrayEquals(answer5, solution(genres5, plays5));
        Assert.assertArrayEquals(answer6, solution(genres6, plays6));
        Assert.assertArrayEquals(answer7, solution(genres7, plays7));
        Assert.assertArrayEquals(answer8, solution(genres8, plays8));
        Assert.assertArrayEquals(answer9, solution(genres9, plays9));
        Assert.assertArrayEquals(answer10, solution(genres10, plays10));
        Assert.assertArrayEquals(answer11, solution(genres11, plays11));
    }
}
