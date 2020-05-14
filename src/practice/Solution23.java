package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Solution23 {
	public static  int[] solution(int[] arr) {
		if(arr.length <= 1) {
			int[]answer = {-1};
			return answer;
		}
		int min = 10000;
		int mem  = 0; 
		for(int i = 0 ; i < arr.length; i ++) {
			if(min > arr[i]) {
				min = arr[i];
				mem = i;
			}
		}
		System.out.println(mem);
		ArrayList <Integer>al = new ArrayList<>();
		for(int i : arr) {
			al.add(i);
		}
		al.remove(mem);
		int[]answer = new int[al.size()];
		for(int i = 0 ; i < al.size(); i ++) {
			answer[i] = al.get(i);
		}
		return answer;
			}
			
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,3,2,1};
		int answer[] = solution(arr);
		for(int i : answer) {
			System.out.println(i);
		}
	}

}
