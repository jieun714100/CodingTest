class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle<90 && angle>0) answer=1;
        if(angle==90) answer=2;
        if(angle<180 && angle>90) answer=3;
        if(angle==180) answer=4;
        return answer;
    }
}