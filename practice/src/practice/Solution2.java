package practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public static  String[] solution(String[] record) {
    	Queue<String>temp = new LinkedList<>();
    	HashMap<String, String>hm = new HashMap<String, String>();
    	for(int i = 0 ; i < record.length; i ++) {
        	String[]tmp = record[i].split(" ");
        	if(tmp[0].equals("Enter") || tmp[0].equals("Change")) {
        		hm.put(tmp[1], tmp[2]);
        	}
        }
    	for(int i = 0 ; i < record.length; i ++) {
        	String[]tmp = record[i].split(" ");
        	if(tmp[0].equals("Enter") ) {
        		
        		String s = hm.get(tmp[1]) +"´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
        		temp.add(s);
        	}
        	else if (tmp[0].equals("Leave")) {
        		String s = hm.get(tmp[1]) +"´ÔÀÌ ³ª°¬½À´Ï´Ù.";
        		temp.add(s);
        	}
        }
    	
    	String[] answer = new String[temp.size()];
    	int i=0;
    	while(!temp.isEmpty()) {
    		answer[i] = temp.poll();
    		i++;
    	}
        
        return answer;
    }
    public static  void main(String[] args) {
    	String [] records = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
    	String [] results = solution(records);
    	for(String s: results) {
    		System.out.println(s);
    	}
    }
}
