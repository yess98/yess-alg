package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution37 {
	  public static  int solution(String arrangement) {
	        int answer = 0;
	        int point =  0 ; 
	        arrangement = arrangement.replaceAll("\\(\\)", "1");
	        System.out.println(arrangement);
	        int length = arrangement.length();
	        Stack st1 = new Stack();
	        Stack  st2 = new Stack();
	        for(int i = length-1; i >= 0 ; i--) {
	  
	        	st1.add(arrangement.charAt(i));
	        	
	        }
	        while(!st1.isEmpty())
	        {
	        	char c = (char) st1.pop();
	        	//System.out.println(st1.peek());
	        	if(c == '(') {
	        		
	        		st2.push('(');
	        	}
	        	else if(c == '1')  {
	        			point += st2.size();
	        		}
	        	
	        	else if(c == ')'){
	        	//	System.out.println(st1.peek());
	        		point  = point + 1;	
	        		st2.pop();
	        	
	        	}
	        }

        	return point;
	    }
	  public static  void main(String[] args) {
		  String temp = "()(((()())(())()))(())";
		  int anw = solution(temp);
		  System.out.println(anw);
	  }
}
