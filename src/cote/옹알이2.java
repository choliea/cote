package cote;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 옹알이2 {
	public int solution(String[] babbling) {
		int answer = 0;
		String[] can = { "aya", "ye", "woo", "ma" };
		for (int i = 0; i < babbling.length; i++) {
			if (babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo")
					|| babbling[i].contains("mama")) {
				continue;
			}
			for (int j = 0; j < can.length; j++) {
				babbling[i] = babbling[i].replaceAll(can[j], "1");
			}
			babbling[i] = babbling[i].replaceAll("1", "");
			if (babbling[i].equals("")) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] park = { 2, 1, 2, 6, 2, 4, 3, 3 };
		String[] routes = { "yayae", "yee", "u", "maa" };
		String[] goal = { "think", "more", "you", "will", "be", "smarter" };
		int answer = new 옹알이2().solution(routes);
		// for (int i = 0; i < answer.length; i++) {
		System.out.print(answer + " ");
		// }
	}
}
