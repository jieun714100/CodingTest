class Solution {
    public int solution(int n) {
        int answer = 0;
        int a=0;
        
        if(n%2==1){
            for(int i=1; i<=n; i++){
                if(i%2==1){
                    answer+=i;
                }
            }
        }else if(n%2==0){
            for(int i=1; i<=n; i++){
                if(i%2==0){
                    a=i*i;
                    answer+=a;
                }
            }
        }
        
        return answer;
    }
}