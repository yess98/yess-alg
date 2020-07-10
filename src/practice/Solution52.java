package practice;
import java.util.*;
public class Solution52 {
	public static int solution(int[] a, int[]b) {
		int answer = 0 ; 
		Arrays.sort(a);
		Integer[]arr= new Integer[b.length];
		for(int i = 0 ; i < arr.length; i ++) {
			arr[i] = b[i];
		}
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i = 0 ; i < a.length; i ++) {
			answer+= a[i] *arr[i];
		
			}
		
		return answer;
	}
	public static void main(String[] args) {
		int [] a = {1,4,2};
		int [] b = {5,4,4};
		int anw = solution(a,b);
		System.out.println(anw);
	}
}