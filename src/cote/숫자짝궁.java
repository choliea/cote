package cote;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 숫자짝궁 {
	public String solution(String X, String Y) {
		StringBuilder answer = new StringBuilder();
		int[] cArr = new int[10];
		for (int i = 0; i < cArr.length; i++) {
			int xlen = X.length();
			int ylen = Y.length();
			X = X.replaceAll(i+"", "");
			Y = Y.replaceAll(i+"", "");
			xlen = xlen-X.length();
			ylen = ylen-Y.length();
			if(xlen>0&&ylen>0) {
				cArr[i] = Math.min(xlen, ylen);
			}
		}
		for (int i = 0; i < cArr.length; i++) {
			int num = cArr[cArr.length-1-i];
			if(num!=0) {
			String add = (9-i)+"";
			for (int j = 0; j < num; j++) {
				answer.append(add);
			}
		}
		if(answer.length()==0)return "-1";
		if(answer.charAt(0)=='0')return "0";
		}
		return answer.toString();
	}

	public static void main(String[] args) {
		int[] park = { 2, 1, 2, 6, 2, 4, 3, 3 };
		String[] routes = { "yayae", "yee", "u", "maa" };
		String[] goal = { "think", "more", "you", "will", "be", "smarter" };
		String answer = new 숫자짝궁().solution("100", "100");
		// for (int i = 0; i < answer.length; i++) {
		System.out.print(answer + " ");
		// }
	}
}
