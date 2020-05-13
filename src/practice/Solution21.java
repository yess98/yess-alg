package practice;

public class Solution21 {
    public static int solution(String s) {
        int answer = 0;
        String arr[] = s.split("");
        if(arr[0].equals("-")) {
        	int temp = arr.length-2;
        	for(int i = 1; i < arr.length; i ++) {
        		answer += Integer.parseInt(arr[i])*Math.pow(10, temp );
        		temp --;
        	}
        	answer = -1 * answer ; 
        	return answer ; 
        }
        else {
        	int temp2 = arr.length-1;
        	for(int i = 0 ; i < arr.length; i ++) {
        		if(arr[i] .equals("+")) {
        			temp2 = arr.length -2;
        			continue;
        		}
        		answer += Integer.parseInt(arr[i])*Math.pow(10, temp2);
        		temp2--;
        	}
        	return answer ; 
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "1234";
		String num2 = "-1234";
		int  a = solution(num1);
		int b = solution(num2);
		System.out.println(a);
		System.out.println(b);
	}

}
