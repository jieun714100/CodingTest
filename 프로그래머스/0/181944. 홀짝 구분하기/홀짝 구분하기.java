import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if(n%2==0)
        System.out.println(n+" is even");
        else if(n%2==1)
        System.out.println(n+" is odd");
    }
}