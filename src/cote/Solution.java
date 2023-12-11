package cote;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Solution {

	public String solution(String[] cards1, String[] cards2, String[] goal) {
		ArrayList<String> card1 = new ArrayList<>();
		ArrayList<String> card2 = new ArrayList<>();

		for (int i = 0; i < cards2.length; i++) {
			card2.add(cards2[i]);
		}
		for (int i = 0; i < cards1.length; i++) {
			card1.add(cards1[i]);
		}
		for (int i = 0; i < goal.length; i++) {
			if (card1.get(0) != card2.get(0)) {
				if (card1.size() != 0 && card1.get(0) == goal[i]) {
					card1.remove(0);
					continue;
				}
				if (card2.size() != 0 && card2.get(0) == goal[i]) {
					card2.remove(0);
					continue;
				}
				return "No";
			}else {
				
			}
		}
		return "Yes";
	}

	public static void main(String[] args) {
		String[] park = { "i", "drink", "water" };
		String[] routes = { "want", "to" };
		String[] command = { "i", "want", "to", "drink", "water" };
		// "#####","# # #", "### #", "# ##", "#####"답
		String answer = new Solution().solution(park, routes, command);
		// for (int i = 0; i < answer.length; i++) {
		System.out.print(answer + " ");
		/// }
	}
}
