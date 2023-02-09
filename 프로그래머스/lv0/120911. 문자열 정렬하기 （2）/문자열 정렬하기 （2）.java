import java.util.*;
class Solution {
    public String solution(String my_string) {
        String str = my_string.toLowerCase();
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}