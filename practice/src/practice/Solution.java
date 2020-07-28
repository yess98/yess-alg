package practice;

import java.util.Stack;

public class Solution {
	  public static  int[] solution(int n, String[] words) {
	        int[] answer = new int[2];
	        Stack <String>temp = new Stack<>();
	        for (int i = 0 ; i < words.length ; i ++) {
	        	if(temp.isEmpty()) {
	        		temp.add(words[i]);
	        		continue;
	        	}
	        	else {
	        		String temp_s  = temp.peek();
	        		char temp_c = temp_s.charAt(temp_s.length()-1);
	        		String now_s = words[i];
	        		char now_c = words[i].charAt(0);
	        		
	        		// 이전 사람의 말과 현재 사람의 말이 이어지지 않을때
	        		if(temp_c !=now_c) {
	        			
	        			answer [0] = i % n +1;
	        			answer[1] = i/n +1;
	        			
	        			return answer ; 
	        		}
	        		
	        		else {
	        			if(temp.contains(now_s)) {
	        			answer [0] = i % n +1;
	        			answer[1] = i/n +1;
	        			return answer ; 
	        			}
	        		temp.add(words[i]);
	        		}
	        	}
	        }
	        answer[0] = 0;
	        answer[1] = 0;
	        
	     
	        return answer;
	    }
	  public static void main(String [] args) {
		  int n = 3; 
		  String[]words = {"tank", "kick", "know", "wheel", "land", "dream", "mother",
				  "robot", "tank"};
		  int [] answer = solution(n, words);
		  for(int i : answer) {
			  System.out.println(i);
		  }
	  }
}
