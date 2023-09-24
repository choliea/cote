package cote;

import java.util.*;
import java.util.Map.Entry;

public class 달리기경주 {

	public String[] solution2(String[] players, String[] callings) {
		String[] answer = new String[players.length];
		Map<String, Integer> a = new HashMap<String, Integer>();
		Map<Integer, String> b = new HashMap<Integer, String>();
		for (int i = 0; i < players.length; i++) {
			a.put(players[i], i);
			b.put(i, players[i]);
		}
		for (int i = 0; i < callings.length; i++) {
			int callingsRank = a.get(callings[i]);
			a.replace(callings[i], callingsRank - 1);
			String prev = b.get(callingsRank - 1);
			b.replace(callingsRank - 1, callings[i]);
			a.replace(prev, callingsRank);
			b.replace(callingsRank, prev);
		}
		for (int i = 0; i < a.size(); i++) {
			answer[i] = b.get(i);
		}

		return answer;
	}

	public String[] solution(String[] players, String[] callings) {
		int n = players.length;
		HashMap<String, Integer> rank = new HashMap<>();

		for (int i = 0; i < n; i++) {
			rank.put(players[i], i);
		}

		for (String calling : callings) {
			int i = rank.get(calling);
			String temp = players[i - 1];
			players[i - 1] = players[i];
			players[i] = temp;

			rank.put(players[i - 1], i - 1);
			rank.put(players[i], i);
		}

		return players;
	}
	/*
	 * public String[] solution(String[] players, String[] callings) { String[]
	 * answer = new String[players.length]; HashMap<String,Integer> rank = new
	 * HashMap<String,Integer>(); for (int i = 0; i < players.length; i++) {
	 * rank.put(players[i],i); }
	 * 
	 * for (int j = 0; j < callings.length; j++) { int i = rank.get(callings[j]);
	 * Set<Map.Entry<String,Integer>> a =rank.entrySet(); String previous = ""; for
	 * (Iterator iterator = a.iterator(); iterator.hasNext();) { Entry<String,
	 * Integer> entry = (Entry<String, Integer>) iterator.next();
	 * if(entry.getValue()==i-1) { previous=entry.getKey(); break; } }
	 * rank.put(previous, i); rank.put(callings[j], i-1); } for (int i = 0; i <
	 * players.length; i++) { answer[rank.get(players[i])]=players[i]; } return
	 * answer; }
	 */

	public static void main(String[] args) {
		String[] park = { "mumu", "soe", "poe", "kai", "mine" };
		String[] routes = { "kai", "kai", "mine", "mine" };
		String[] answer = new 달리기경주().solution(park, routes);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
