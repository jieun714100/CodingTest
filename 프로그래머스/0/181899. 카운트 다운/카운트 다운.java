class Solution {
    public int[] solution(int start_num, int end_num) {
        int numlong=(start_num)-(end_num)+1;
        int[] answer = new int[numlong];
        
        for(int i=0; i<numlong; i++)
                answer[i]=start_num -i;
            
        
        return answer;
    }
}