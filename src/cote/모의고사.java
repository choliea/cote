package cote;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 모의고사 {

	public ArrayList<Integer> solution(int[] answers) {
		int[] answer = new int[3];
		int[] first = { 1, 2, 3, 4, 5 };
		int[] second = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] third = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int firstScore = score(first,answers);
		int secondScore = score(second,answers);
		int thirdScore = score(third,answers);
		int max = Math.max(secondScore, thirdScore);
		max = Math.max(max, firstScore);
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(max==firstScore) list.add(1);
		if(max==secondScore) list.add(2);
		if(max==thirdScore) list.add(3);
		return list;
	}
	
	public int score(int[] person,int[] answers) {
		int score = 0;
		for (int i = 0; i < answers.length; i++) {
			if(answers[i]==person[i%person.length])score++;
		}
		return score;
	}

	public static void main(String[] args) {
		int[] park = { 1, 2, 3, 4, 5 };
		String[] routes = { "Z 3", "D 5" };
		String[] goal = { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };
		ArrayList<Integer> answer = new 모의고사().solution(park);
		for (int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i) + " ");
		}
	}
}
