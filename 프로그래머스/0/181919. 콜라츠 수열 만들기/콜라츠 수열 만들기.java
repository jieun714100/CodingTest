class Solution {
    public int[] solution(int n) {
        
        int temp=n;
        int count=1;
        
        while(temp!=1){
            if(temp%2==0){
               temp=temp/2;
            
        }else{
            temp=temp*3+1;
        }
        count++;
    }
    
    int[]answer=new int[count];
    int i=0;
    
    while(n!=1){
        answer[i++]=n;
        if(n%2==0){
            n=n/2;
        }else{
            n=n*3+1;
        }
    }
    answer[i]=1;
        
        return answer;
    }
}