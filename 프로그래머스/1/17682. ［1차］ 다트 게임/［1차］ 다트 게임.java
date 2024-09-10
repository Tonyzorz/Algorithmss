class Solution {
    int index = -1;
    int[] numbers = new int[3];
    int number = 0;
    
    public int solution(String dartResult) {
        int answer = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char letter = dartResult.charAt(i);
            if (Character.isDigit(letter)) {
                number += (int) letter - '0';

                if ('0' == dartResult.charAt(i + 1)) {
                    number *= 10;
                    index--;
                }

                index++;

            } else {
                checkSign(letter);
                number = 0;
            }
        }

        for (int num : numbers) {
            answer += num;
        }

        return answer;
    }

    public void checkSign(char letter) {

        switch (letter) {
            case 'S':
                numbers[index] = number;

                break;
            case 'D':
                numbers[index] = (int) Math.pow(number, 2);

                break;
            case 'T':
                numbers[index] = (int) Math.pow(number, 3);

                break;
            case '*':
                numbers[index] = numbers[index] * 2;

                if (index > 0) {
                    numbers[index - 1] = numbers[index - 1] * 2;
                }

                break;
            case '#':
                numbers[index] = numbers[index] * -1;

                break;
        }
    }
}