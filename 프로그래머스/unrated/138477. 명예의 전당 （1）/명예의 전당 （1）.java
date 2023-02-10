import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list);
            answer[i] = list.get(i < k ? 0 : list.size() - k);
            System.out.println(answer[i]);
        }
        return answer;
    }
}