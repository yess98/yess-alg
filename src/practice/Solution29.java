package practice;

import java.util.ArrayList;

public class Solution29 {
	public static  int solution(int n) {
        int answer = 0;
        String temp = "";
        int sn = n;
        while(n>0) {
        	int tmp = n %2 ; 
        	n= n/2;
        	temp =  String.valueOf(tmp)  + temp ;
        }
        int []al = new int[temp.length()];
       for(int i = 0 ; i < temp.length(); i ++)
       {
    	    al[i] = (Character.getNumericValue(temp.charAt(i)));
       }
       int count = 0;
       for(int i = 0;  i < al.length; i ++) {
    	   if(al[i]== 1)
    	   {
    		   count ++;
    	   }
       }
     
       int cnt = 0;
       
      
       int p ;
       for( p = sn+1;cnt != count ; p++) {
       String temp_s = Integer.toBinaryString(p);
       cnt = 0 ;
       for(int i = 0 ; i < temp_s.length(); i ++) {
    	   if(temp_s.charAt(i) == '1') {
    		   cnt ++;
    		  
    	   }
       }
   
       }
       answer = p-1;
       System.out.println(cnt);
      
       
       return answer ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 78;
		int n2 = 15;
		int answer = solution(n);
		int answer2 = solution(n2);
		System.out.println(answer);
		System.out.println(answer2);
	}

}
