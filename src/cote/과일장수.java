package cote;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class 과일장수 {

	public int solution(int k, int m, int[] score) {
		Arrays.sort(score);
		int len = score.length;
		int answer = 0;
		for (int i = len-m; i>=0; i-=m) {
			answer+=score[i]*m;
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] park = { 1, 2, 3, 1, 2, 3, 1 };
		String[] routes = { "think", "more", "will", "be" };
		String[] goal = { "think", "more", "you", "will", "be", "smarter" };
		int answer = new 과일장수().solution(3, 4, park);
		// for (int i = 0; i < answer.length; i++) {
		System.out.print(answer + " ");
		// }
	}
}
