import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) { // null인경우
                map.put(s.charAt(i), i);
                answer[i] = -1;
            } else { // null이 아닌경우
                answer[i] = i - map.get(s.charAt(i));
                map.put(s.charAt(i), i);
            }
        }
        return answer;
    }
}