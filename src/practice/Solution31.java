package practice;

public class Solution31 {
	   public static int solution(int n) {
	        int answer = 0;
	        int[]temp = new int[n];
	        for(int i = 0  ; i < temp.length; i ++) {
	        	temp[i] = i+1;
         }
	        for(int i = 0 ; i < temp.length;i++ ) {
	        	int anw = 0;
	        	anw = temp[i];
	        	if(temp[i] == n) {
	        		answer ++;
	        	}
	        	for(int j = i+1 ; j< temp.length;) {
	        		if(anw < n) {
	        			//System.out.println(anw);
	        			anw = anw + temp[j];
	        			j++;
	        		}
	        		else if (anw == n) {
	        		
	        			answer ++;
	        			break;
	        		}
	        		else {
	        			break;
	        		}
	        		
	        	}
	        
	        
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int answer = solution(n);
		System.out.print(answer);
	}

}
