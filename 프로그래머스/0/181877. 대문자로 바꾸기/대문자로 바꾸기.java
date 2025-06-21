class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            char a=myString.charAt(i);
            if(a>='a'&&a<='z'){
                answer+=(char)(a-32);
            }else{
                answer+=a;
            }
        }
        return answer;
    }
}