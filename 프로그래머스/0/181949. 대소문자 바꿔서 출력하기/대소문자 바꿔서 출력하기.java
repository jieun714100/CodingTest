import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            
            if('A'<=ch&&ch<='Z'){
                ch+=32;
            }else if('a'<=ch&&ch<='z'){
                ch-=32;
            }
             System.out.print(ch);
        }
       
        
    }
}