package cote;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 기능개발 {

	public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int count = 0;
		for (int j = 0; j < progresses.length; j++) {
			if (progresses[j] >= 100) {
				count++;
				continue;
			} else {
				j--;
				for (int i = 0; i < speeds.length; i++) {
					progresses[i] += speeds[i];
				}
			}
			if (count != 0) {
				answer.add(count);
				count = 0;
			}
		}
		if (count != 0) {
			answer.add(count);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] lost = { 93, 30, 55 };
		int[] reverse = { 1, 30, 5 };
		String[] routes = { "AGZ", "BSSS" };
		String[] goal = { "ASA", "BGZ" };
		ArrayList<Integer> answer = new 기능개발().solution(lost, reverse);
		for (int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i) + " ");
		}
	}
}
