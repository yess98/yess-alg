package practice;

import java.util.Stack;

public class Solution16 {
	  public static int solution(int n, int[][] computers) {
	        int answer = 0;
	        // arr은 인접행렬 
	        //n은 컴퓨터 3대 
	        boolean check[] = new boolean[n];
	   
	        for(int i = 0 ; i < n; i ++) {
	        	if(check[i] == false) {
	        		answer ++; 
	        		solution2(check,i ,computers);
	        	}
	        }

	        
	     
	        return answer;
	    }
	public static void solution2(boolean check[], int n , int[][]computer) {
	     Stack<Integer>stack  = new Stack<>();
	     stack.add(n);
		while(!stack.isEmpty()) {
       	int  a = stack.pop();
       	check[a] = true;
       for(int i = computer.length -1 ; i>= 0 ; i--) {

       	if(computer[a][i] == 1 && check[i] == false) {
       		stack.push(i);
       		
       	}
       }
       }
     

	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3; 
		int arr [][] = {{1,1,0},{1,1,0},{0,0,1}};
		int answer = solution(n, arr);
		System.out.println(answer);
		
	}

}
