class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        if (num % 2 != 0) {
            answer[(num+1)/2 - 1] = total / num;
            for (int i = 1; i < num/2 + 1; i++) {
                answer[(int)Math.ceil((num)/2) - i] = total / num - i;
                answer[(int)Math.ceil((num)/2) + i] = total / num + i;
            }
        } else {
            for (int i = 0; i < num/2; i++) {
                answer[(int)Math.floor((num)/2) - i - 1] = total / num - i;
                answer[(int)Math.ceil((num)/2) + i] = total / num + i + 1;
            }
        }
        return answer;
    }
}