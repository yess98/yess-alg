package practice;


import java.util.ArrayList;

import java.util.Arrays;

 

public class Solution1 {

	   

	public static  int solution(String[] lines) {

	        int answer = 0;

	        ArrayList <Integer> al = new ArrayList<>();
	        ArrayList < Integer>al2 = new ArrayList<>();
	        if(lines.length == 1) {

	        	return 1;

	        }

	        for(int i = 0 ; i < lines.length ; i ++) {

	        	String[] times = lines[i].split(" ");

 

	        	int starttime = makestarttime(times[1],times[2]);

	        	int endtime = parsetime(times[1]);

	        	al.add(starttime);

	        	al2.add(endtime);

	        }
	        

	        int [] time_arr = new int[al.size()];
	        int [] time_arr2 = new int[al2.size()];

	        for(int i  = 0 ; i < time_arr.length; i ++) {

	        	time_arr[i] = al.get(i);
	        	time_arr2[i] = al2.get(i);

	        }
	        for(int i : time_arr) {
	        	System.out.println(i);
	        }
	        
	        System.out.println("끝나는 시간 ");
	       for (int j : time_arr2) {
	    	   System.out.println(j);
	       }

	
	        for (int i = 0 ; i < lines.length ; i++) {
	        	int cnt = 0 ; 
	        	int starttime = time_arr[i];
	        	int endtime = starttime +1000;
	        	for(int j = 0 ; j < lines.length ; j ++) {
	        		if(time_arr[j]>= starttime && time_arr[j] < endtime) {
	        			cnt ++;
	        		}
	        		else if (time_arr2[j] >= starttime && time_arr2[j]<endtime) {
	        			cnt ++;
	        		}
	        		else if(time_arr[j]<=starttime && time_arr2[j] >=endtime) {
	        			cnt ++;
	        		}
	        	}
	        	answer = cnt > answer ? cnt : answer ;
	        }
	        
	        
	        // 시간 순서 정렬은 완료 된 상태이고 여기서 비교해서 초당 처리량을 출력해주는 부분이 남아있음 !!!
	        for (int i = 0 ; i < lines.length ; i++) {
	        	int cnt = 0 ; 
	        	int starttime = time_arr2[i];
	        	int endtime = starttime +1000;
	        	for(int j = 0 ; j < lines.length ; j ++) {
	        		if(time_arr[j]>= starttime && time_arr[j] < endtime) {
	        			cnt ++;
	        		}
	        		else if (time_arr2[j] >= starttime && time_arr2[j]<endtime) {
	        			cnt ++;
	        		}
	        		else if(time_arr[j]<=starttime && time_arr2[j] >=endtime) {
	        			cnt ++;
	        		}
	        	}
	        	answer = cnt > answer ? cnt : answer ;
	        }


	        return answer;

	    }

	public static int makestarttime(String endtime , String duration) {

		int f_time; 

		String [] arr = endtime.split(":");

		f_time = Integer.parseInt(arr[0]) *60 *60*1000;

		f_time += Integer.parseInt(arr[1])  *60 *1000;

		f_time += Double.parseDouble(arr[2])* 1000;

 

		int dur_time = (int)(Double.parseDouble(duration.substring(0,duration.length()-1))*1000);

 

		f_time = f_time - dur_time +1;

		return f_time ; 

	}

	public static int parsetime(String time) {

		int f_time ; 

		String[] arr = time.split(":");

		f_time = Integer.parseInt(arr[0])*60 *60*1000;

		f_time += Integer.parseInt(arr[1])  *60 *1000;

		f_time += Double.parseDouble(arr[2])* 1000;

 

		

		return f_time; 

	}

	   public static void main(String[] args) {

		   String[] lines = {"2016-09-15 20:59:57.421 0.351s",

"2016-09-15 20:59:58.233 1.181s",

"2016-09-15 20:59:58.299 0.8s",

"2016-09-15 20:59:58.688 1.041s",

"2016-09-15 20:59:59.591 1.412s",

"2016-09-15 21:00:00.464 1.466s",

"2016-09-15 21:00:00.741 1.581s",

"2016-09-15 21:00:00.748 2.31s",

"2016-09-15 21:00:00.966 0.381s",

"2016-09-15 21:00:02.066 2.62s"};

		   String[] lines3 = {"2016-09-15 23:59:59.999 0.001s"};

		   

		   String lines2[] = {"2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s"};

		   int n = solution(lines2);

		   System.out.println(n);

	   }

}