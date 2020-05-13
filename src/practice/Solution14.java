package practice;

import java.util.LinkedList;

public class Solution14 {
	  public static int solution(int cacheSize, String[] cities) {
	        int answer = 0;
	        String capcities [] =new String [cities.length];
	        for(int i = 0 ; i < capcities.length; i ++) {
	        	capcities[i] = cities[i].toUpperCase();
	        }
	        LinkedList < String > list = new LinkedList <String>();
	        if(cacheSize == 0 ) {
	        	answer = 5 * cities.length;
	        	return answer ; 
	        }
	        
	        for(int i = 0 ; i < cities.length; i ++) {
	        	if(list.size() == 0 ) {
	        		list.add(capcities[i]);
	        		answer = answer + 5;
	        	}
	        	else {
	        		if(list.contains(capcities[i])) {
	        			list.remove(capcities[i]);
	        			list.add(capcities[i]);
	        			answer ++;
	        		}
	        		else if(list.size() < cacheSize) {
	        			list.add(capcities[i]);
	        			answer = answer+ 5;
	        		}
	        		else {
	        			list.remove();
	        			list.add(capcities[i]);
	        			answer = answer  + 5;
	        		}
	        		
	        		
	        	}
		       }
	        
	       
	        return answer;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; 
		String [] city = {"Jeju", "Jeju", 
				"Jeju", "Jeju", "hello", "Jeju", "Jeju", "Jeju", "Jeju", "Jeju"};		
		int anwer = solution(n,city);
		// 5 5 5 
		System.out.println(anwer);
	}

}
