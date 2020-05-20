package practice;

public class Solution25 {
    public static String solution(int n) {
        String answer = "";
        int a = n / 2;
        while(a > 0) {
        	answer += "¼ö¹Ú";
        	a--;
        }
        int b = n  %2 ;
        if(b == 1) {
        	answer += "¼ö";
        }
  
        
        return answer;
    }
    public static void main(String args[]) {
    	int n = 3; 
    	String answer = solution(n);
    	System.out.println(answer);
    }
}
