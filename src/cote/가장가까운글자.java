package cote;

import java.util.*;
import java.util.Map.Entry;

public class 가장가까운글자 {

	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		Arrays.fill(answer, -1);
		for (int i = 1; i < s.length(); i++) {
			int index = 0;
			for (int j = i-1; j >= 0; j--) {
				index++;
				if(s.charAt(i)==s.charAt(j)) {
					answer[i] = index;
					break;
				}
			}
			
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] park = { 9, 20, 28, 18, 11 };
		int[] routes = { 30, 1, 21, 17, 28 };
		int[][] command = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		// "#####","# # #", "### #", "# ##", "#####"답
		int[] answer = new 가장가까운글자().solution("banana");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
