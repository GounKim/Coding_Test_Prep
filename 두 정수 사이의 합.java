// 두 정수 사이의 합
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a > b) {
            int save = a;
            a = b;
            b = save;
        }
        
        for (;a <= b; a++) {
            answer += a;
        }
        
        return answer;
    }
}
