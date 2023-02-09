class Solution {
    public int solution(int num, int k) {
        String a = Integer.toString(num);
        String b = Integer.toString(k);
        if (a.indexOf(b) == -1 ) {
            return -1;
        } else {
            return a.indexOf(b) + 1;
        }
    }
}