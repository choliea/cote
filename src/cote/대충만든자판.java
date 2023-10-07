package cote;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 대충만든자판 {

	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < keymap.length; i++) {
			for (int j = 0; j < keymap[i].length(); j++) {
				if(map.getOrDefault(keymap[i].charAt(j), 0)==0||map.getOrDefault(keymap[i].charAt(j), 0)>j+1)
					map.put(keymap[i].charAt(j), j+1);
			}
		}
		for (int i = 0; i < targets.length; i++) {
			int repeat = 0;
			for (int j = 0; j < targets[i].length(); j++) {
				int temp = map.getOrDefault(targets[i].charAt(j),-1);
				if(temp!=-1)
				repeat+=temp;
				else {
				repeat=-1;
				break;
				}
			}
			answer[i] = repeat;
			
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] park = { 1, 2, 3, 4, 5 };
		String[] routes = { "AGZ","BSSS" };
		String[] goal = { "ASA","BGZ" };
		int[] answer = new 대충만든자판().solution(routes,goal);
		 for (int i = 0; i < answer.length; i++) {
		System.out.print(answer[i] + " ");
		 }
	}
}
