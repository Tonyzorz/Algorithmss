class Solution {
   public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binaryArr1 = new String[n];
        String[] binaryArr2 = new String[n];

        //convert number to binary
        for (int i = 0; i < n; i++) {
            binaryArr1[i] = convertToBinary(arr1[i], n);
            binaryArr2[i] = convertToBinary(arr2[i], n);
        }
        //System.out.println(Arrays.toString(binaryArr1));;
        //System.out.println(Arrays.toString(binaryArr2));;
        //merge two binary to form a map
        for (int i = 0; i < n; i++) {
            String binary1 = binaryArr1[i];
            String binary2 = binaryArr2[i];

            answer[i] = makeMap(binary1, binary2);
        }

        return answer;
    }

    public String convertToBinary(int number, int n) {
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            sb.append(number % 2);
            number /= 2;
        }

        if (sb.length() < n) {
            int repeat = n - sb.length();

            for (int i = 0; i < repeat; i++) {
                sb.append("0");
            }
        }

        return sb.reverse().toString();
    }

    public String makeMap(String binary1, String binary2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < binary1.length(); i++) {
            if (binary1.charAt(i) == '1' || binary2.charAt(i) == '1') {
                sb.append("#");
            } else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}