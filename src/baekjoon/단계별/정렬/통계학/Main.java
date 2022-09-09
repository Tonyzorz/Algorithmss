package baekjoon.단계별.정렬.통계학;

import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iteration = Integer.parseInt(br.readLine());

        int avg = 0;
        int mid = 0;
        int mostAppeared = 0;
        int range = 0;

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> appeared = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> set = new HashMap<>();

        for (int i = 0; i < iteration; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
            avg += num;

            int key = appeared.getOrDefault(num, 0) + 1;
            appeared.put(num, key);
            if (mostAppeared < key) {
                mostAppeared = key;
            }

            ArrayList<Integer> nums = set.getOrDefault(key, new ArrayList<>());
            nums.add(num);
            set.put(key, nums);
        }

        Collections.sort(list);
        avg = Math.round((float)avg / list.size());
        mid = list.get(list.size() / 2);

        ArrayList<Integer> nums = set.get(mostAppeared);
        Collections.sort(nums);
        mostAppeared = nums.get(0);
        if (nums.size() > 1) {
            mostAppeared = nums.get(1);
        }

        range = list.get(list.size() - 1) - list.get(0);

        bw.write(avg + "\n");
        bw.write(mid + "\n");
        bw.write(mostAppeared + "\n");
        bw.write(range + "\n");
        br.close();
        bw.close();
    }

}
