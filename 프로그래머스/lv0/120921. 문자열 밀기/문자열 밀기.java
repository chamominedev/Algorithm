class Solution {
    public int solution(String A, String B) {
        int answer = -1;

        char arrA[] = A.toCharArray();
        char arrB[] = B.toCharArray();

        for (int i = 0; i < arrA.length; i++) {
            B = "";
            for (int j = 0; j < arrB.length; j++) {
                B += arrB[j];
            }

            if (A.equals(B)) {
                answer = i;
                break;
            }
            char temp = arrB[0];
            for (int j = 0; j < B.length() - 1; j++) {
                arrB[j] = arrB[j + 1];
            }
            arrB[arrB.length - 1] = temp;
        }

        return answer;
    }
}