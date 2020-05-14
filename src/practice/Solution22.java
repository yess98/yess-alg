package practice;

import java.util.Arrays;
import java.util.Comparator;

public class Solution22 {
	   public static  long solution(long n) {
	        double answer = 0;
	        double temp = (double)n;
	       int check = (int ) Math.sqrt(temp);
	        if(check==Math.sqrt(temp)) {
	        	System.out.println(Math.sqrt(temp));
	        	answer = Math.pow(Math.sqrt(temp)+1,2);
	        	return (long)answer;
	        }
	        else {
	        	return -1;
	        }
	    }
	public static void main(String[] args) {
	int n = 121;
	int n2 = 3;
	long answer2 = solution(n2);
	long answer = solution(n);
	System.out.println(answer);
	System.out.println(answer2);
		
	}

}
