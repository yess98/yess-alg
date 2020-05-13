package practice;

public class Solution20 {
    public static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        int [] num = new int[str.length()];
        for(int i = 0 ; i<num.length; i ++) {
        	num[i] = str.charAt(i)-'0';
        }
        for(int i : num) {
        	answer += i;
        }
        

        return answer;
   
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 987;
		int anw = solution(n);
		System.out.println(anw);
		
	}

}
