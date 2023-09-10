package cote;

import java.util.*;

public class 숫자찾기 {
	 public int solution(int num, int k) {
	        int answer = -1;
	        char[] arr = (num+"").toCharArray();
	        for (int i = 0; i < arr.length; i++) {
				if(arr[i]==k+'0') {
					return 1+i;
				}
			}
	        return answer;
	    }
	 public int solution2(int num, int k) {
		 return ("-" + num).indexOf(k+"");
	 }

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(new 숫자찾기().solution(232443,4));
	}
}
