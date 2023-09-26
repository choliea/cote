package cote;

import java.util.*;
import java.util.Map.Entry;

public class 콜라빈병 {

	public int solution(int a, int b, int n) {// a개면 b개 증정 총 n개
		int answer = 0;
		int have = n;
		return recycle(answer,have,a,b);
	}
	
	public int recycle(int answer, int have, int a, int b) {
		answer+=(have/a)*b;
		have=(have/a)*b+have%a;
		
		if(have<a)return answer;
		else return recycle(answer,have,a,b);
	}

	public static void main(String[] args) {
		int[] park = { 2, 1, 3, 4, 1 };
		int[] routes = { 30, 1, 21, 17, 28 };
		int[][] command = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		// "#####","# # #", "### #", "# ##", "#####"답
		int answer = new 콜라빈병().solution(2, 1, 20);
		// for (int i = 0; i < answer.length; i++) {
		System.out.print(answer + " ");
		/// }
	}
}
