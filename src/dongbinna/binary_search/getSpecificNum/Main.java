package dongbinna.binary_search.getSpecificNum;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int lowerBound(int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) end = mid;
            else start = mid + 1;
        }
        return end;
    }

    public static int upperBound(int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) end = mid;
            else start = mid + 1;
        }
        return end;
    }

    // 값이 [left_value, right_value]인 데이터의 개수를 반환하는 함수
    public static int countByRange(int[] arr, int leftValue, int rightValue) {
        // 유의: lowerBound와 upperBound는 end 변수의 값을 배열의 길이로 설정
        int rightIndex = upperBound(arr, rightValue, 0, arr.length);
        int leftIndex = lowerBound(arr, leftValue, 0, arr.length);
        return rightIndex - leftIndex;
    }
    
    // 7 2 
    // 1 1 2 2 2 2 3
    // expected = 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int getNum = Integer.parseInt(st.nextToken());
        
        int[] nums = new int[size];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        int count = countByRange(nums, getNum, getNum);
        bw.write("" + count);
        br.close();
        bw.close();
    }

}
