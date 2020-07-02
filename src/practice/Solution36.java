package practice;

import java.util.Stack;

public class Solution36 {
    
	public static  int solution(int[][] baseball) {
        int answer = 0;
        Stack <Integer> st = new Stack<>();
        for(int i = 1; i <=9 ; i ++) {
        	for(int j = 1; j <= 9 ; j ++) {
        		for(int p = 1 ; p <= 9; p ++) {
        			if(i!=j && i !=p) {
        				if(j != p) {
        					
        					st.push(i*100 + j *10 + p);
        				}
        			}
        		}
        	}
        }
        System.out.println(st.size());
        int strike = 0 ; 
        int ball = 0 ;
        int count = 0 ; 
        
        while(!st.isEmpty()) {
        
        	String temp = String.valueOf(st.pop());
        for(int i = 0 ; i < baseball.length;i++ ) {
        	String s = String.valueOf(baseball[i][0]);
        	
        	for(int j =  0 ; j < 3; j ++) {
        		if(s.charAt(j) == temp.charAt(j)) {
        			strike ++;
        		}
        		if(s.contains(String.valueOf(temp.charAt(j)))){
        			ball++;
        		}
        	}
        	ball = ball - strike;
        	if(strike!= baseball[i][1] || ball != baseball[i][2]) {
        		ball = 0 ; 
        		strike = 0 ; 
        		break;
        	}
        	
        	if(i == baseball.length - 1) {
        			count ++;
        		}
        	ball = 0 ; 
        	strike = 0 ; 
        	}
        	
        	
        	
        }
        
        return count;
    }
    public static void main(String [] args) {
    	int [][] score = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
    	int answer = solution(score);
    	System.out.println(answer);
    }
}
