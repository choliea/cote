package cote;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 문자열나누기 {

	public int solution(String s) {
		int answer = 0;
		char firstLetter = '0'; 
		int count=0;
		for(char c : s.toCharArray()) {
			if(count==0) {
			firstLetter = c;
			answer++;
			}
			
			if(firstLetter==c) {
				count++;
			}else {
				count--;
			}
			
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] park = { 1, 2, 3, 4, 5 };
		String[] routes = { "AGZ", "BSSS" };
		String[] goal = { "ASA", "BGZ" };
		int answer = new 문자열나누기().solution("aaabbaccccabba");
		//for (int i = 0; i < answer.length; i++) {
			System.out.print(answer + " ");
		//}
	}
}
