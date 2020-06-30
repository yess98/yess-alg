package practice;

import java.util.Hashtable;

// 방금 그곡 
//조건이 일치하는 음악이 여러 개일 때에는 라디오에서 재생된 시간이 제일 긴 음악 제목을 반환한다.
//재생된 시간도 같을 경우 먼저 입력된 음악 제목을 반환한다.

public class Solution34 {
    public static  String solution(String m, String[] musicinfos) {
        String answer = "";
        int length = musicinfos.length;
        String []title = new String [length];
        String [] start = new String [length ];
        String [] finish = new String [length ];
        int songlength [] = new int [length ];
        boolean [] result = new boolean[length];
        m= replace(m);
       for(int i = 0 ; i < length ; i ++) {
        	int idx = musicinfos[i].indexOf(",");
        	start[i] = musicinfos[i].substring(0,idx);
        	musicinfos[i] = musicinfos[i].substring(idx+1);
        	int idx2 = musicinfos[i].indexOf(",");
        	finish[i] = musicinfos[i].substring(0,idx2);
        	
        	musicinfos[i] = musicinfos[i].substring(idx2+1);
        	int idx3 = musicinfos[i].indexOf(",");
        	title[i] = musicinfos[i].substring(0, idx3);
        	musicinfos[i] = musicinfos[i].substring(idx3+1);
        //	System.out.println(musicinfos[i]);
        	songlength [i] = musicinfos[i].length();
       }
     
       int time[] = new int[length ];
       for(int i = 0; i < length ; i ++) {
    	   String t1 = start[i].substring(0,2);
    	   String t2 = start[i].substring(3,5);
    	   String t3 = finish[i].substring(0,2);
    	   String t4 = finish[i].substring(3,5);
    	   if(t1.equals(t3)) {
    		   time[i]= Integer.parseInt(t4)-Integer.parseInt(t2);
    		   System.out.println(time[i]);
    	   }
    	   else {
    		   time[i] =  60 * (Integer.parseInt(t3)-Integer.parseInt(t1)) + Integer.parseInt(t4) - Integer.parseInt(t2);
    		   System.out.println(time[i]);
    	   }
       }
       for(int  i = 0 ; i < length ; i ++) {
    	   musicinfos[i] = replace(musicinfos[i]);
       }
       // 시간동안 나온 음 찾기 
       for(int i = 0 ; i < length ; i ++) {
    
    	   String music = musicinfos[i];
    	   if(music.length() > time[i]) {
    		   music  = music.substring(0,time[i]);
    	   }
    	   if(music.length() == time[i]) {
    		   if(music.contains(m)) {
    			 result[i] = true;
    			 continue;
    		   }
    		   
    	   }
    	   if(music.length() < time[i]) {
    		   int a = time[i] - music.length(); 
    		   for( int p = 0 ; p < a; p ++) {
    			  music =  music.concat(music.substring(p,p+1));
    		   }
    		   if(music.contains(m)) {
    			 result[i] = true; 
    			 continue;
    			   
    		   }
    	   }
    	   if(m.length() > music.length()) {
    		   continue;
    	   }
    	   
       }
       
       int t = 0 ;
       int keys = 0 ;
       Hashtable <Integer, String> ht = new Hashtable <Integer,String>();
       for(int i = 0 ; i < length ; i ++) {
    	   ht.put(i,title[i]);
    	   
       }
       int count = 0 ; 
       	for(int i = 0 ; i < result.length; i ++) {
       		if(result[i] == true) {
       			count ++;
       			if(t < time[i]) {
       				t = time[i];
       				keys = i;
       			}
       		}
       	}
     	if(count == 0 ) {
           	answer = "(None)";
            return answer;
           	}
     	
       	answer = ht.get(keys);
       	return answer; 
       
    }
    public static String replace(String s ) {
    	String temp = "";
    	String s_1 = s;
    	if(s.contains("#")) {
    		for(int i = 0 ; i < s.length(); i ++) {
    			if(s.charAt(i) == '#') {
    				
    				s= s.substring(0,i-1)+String.valueOf(s.charAt(i-1)).toLowerCase()+s.substring(i+1,s.length());
    				
    		}
    		}
    	}
    	System.out.println(s);
    	
    	temp = s;
    	
    	return temp;
    }
    public static void main(String []args) {
    	String s1 = "ABCDEFG";
    	String [] s1_1 = {
    		"12:00,12:14,HELLO,CDEFGAB",
    		"13:00,13:05,WORLD,ABCDEF"
    	};
    	String s2 = "ABC";
    	String s2_2[] = {
    			"12:00,12:18,HELLO,C#DEFGABC",
    			"13:00,13:23,WORLD,ABCDEF"
    	};
    	String s3 = "CC#BCC#BCC#BCC#B";
    	String s3_3[] ={
    			"02:00,03:30,FOO,CC#B",
    			"04:00,04:08,BAR,CC#BCC#BCC#B"};
    	String answer1 = solution(s2,s2_2);
    	System.out.println(answer1);
    }
}
