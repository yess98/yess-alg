package practice;

public class Solution17 { 
	public static  int solution(int m, int n, int[][] puddles) {
    int answer = 0;
    int dp [][] = new int[n+1][m+1];

    for(int i = 0 ; i < puddles.length; i ++) {
	for(int j = 0 ; j < 2; j ++) {
		dp[puddles[i][1]][puddles[i][0]] = -1;
		}
    }
    dp[1][1] = 1;
    for(int i = 1 ; i <= n ; i ++) {
    	for(int j = 1 ; j <= m ;j ++) {
        
		if(dp[i][j] == -1) {
			continue;
		}
		if(i ==1 && j == 1) {
			dp[i][j] = 1;
		}
		else {
		
		 if(dp[i-1][j] == -1 || dp[i][j-1] == -1) {
				dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) % 1000000007;
		
    		}
			else {
			dp[i][j] = (dp[i-1][j]+dp[i][j-1]) % 1000000007;
		
			}
		}
	}
}
    for(int i = 0 ; i < n+1; i ++) {
    	for(int j = 0 ; j < m+1; j ++) {
    		System.out.print(dp[i][j]);
    	}
    	System.out.println();
    }
answer = dp[n][m];
return answer;

}
	   public static void main(String [] args) {
		   int m = 4; 
		   int n = 3; 
		   int puddles[][] = {{2,2}};
		   int answer = solution(m, n, puddles);
		   System.out.println(answer);
		   
		   
	   }
}
