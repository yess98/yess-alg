package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution32 {
	   public static  int solution(int cacheSize, String[] cities) {
	        int answer = 0;
	        // cache hit = 1
	        // cache miss = 5
	        if(cacheSize == 0 ) {
	        	answer = 5 * cities.length;
	        	return answer ; 
	        }
	        String [] newcities = new String[cities.length];
	        for(int i = 0 ; i < newcities.length; i ++) {
	        	newcities[i] = cities[i].toLowerCase();
	        }
	        Queue<String>queue = new LinkedList<>();
	        int tmp=1; 
	        for(int i = 0 ;i< newcities.length; i ++) {
	        	if(queue.size() > cacheSize) {
	        		queue.poll();
	        	}
	        	if(queue.contains(newcities[i])) {
	        		queue.remove(newcities[i]);
	        		queue.add(newcities[i]);
	        		answer++;
	        	}
	        	else {
	        		queue.add(newcities[i]);
	        		answer = tmp *5  + answer ;
	        		
	        	}
	        	}
	        
	        return answer;
	    }
	        	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 0; 
		String cities[] = {" Jeju", "Pangyo", "Seoul","new york","la"};
		int answer = solution(n,cities);
		System.out.println(answer);
		
	}

}
