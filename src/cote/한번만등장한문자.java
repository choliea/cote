package cote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class 한번만등장한문자 {

	public String solution(String s) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			int fLen = s.length();
			char c = s.charAt(i);
			s = s.replaceAll(s.charAt(i) + "", "");
			if (fLen - s.length() == 1) {
				answer += c;
			}
			i--;
		}
		char[] ca = answer.toCharArray();
		Arrays.sort(ca);
		answer = String.valueOf(ca);
		return answer;
	}

	public String solution2(String s) {
		String answer = "";
		char[] chars = s.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (char c : chars) {
			charMap.put(c, charMap.getOrDefault(c, 0) + 1);
		}

		for (char c : charMap.keySet()) {
			if (charMap.get(c) == 1) {
				answer += c;
			}
		}
		char[] ca = answer.toCharArray();
		Arrays.sort(ca);
		return new String(ca);
	}

	public String solution3(String s) {
		int[] alpha = new int[26];
		for (char c : s.toCharArray()) {
			alpha[c - 'a']++;
		}

		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			if (alpha[i] == 1) {
				answer.append((char) (i + 'a'));
			}
		}
		return answer.toString();
	}

	public static void main(String[] args) {
		int[][] a = { { 80, 70 }, { 90, 50 }, { 40, 70 }, { 50, 80 } };
		String[] d = { "def", "dww", "dzx", "loveaw" };
		System.out.println(new 한번만등장한문자().solution("abcabcadc"));
	}
}
