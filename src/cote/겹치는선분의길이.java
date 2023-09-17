package cote;

import java.util.*;

public class 겹치는선분의길이 {

	public int solution(int[][] lines) {
		int answer = 0;
		List<HashSet<Integer>> lineList = new ArrayList<HashSet<Integer>>();
		List<HashSet<Integer>> tempLineList = new ArrayList<HashSet<Integer>>();
		for (int i = 0; i < lines.length; i++) {
			HashSet<Integer> line = new HashSet<Integer>();
			HashSet<Integer> tempLine = new HashSet<Integer>();
			for (int j = lines[i][0]; j < lines[i][1] + 1; j++) {
				line.add(j);
				tempLine.add(j);
			}
			lineList.add(line);
			tempLineList.add(tempLine);
		}
		tempLineList.get(0).retainAll(lineList.get(1));
		answer = (tempLineList.get(0).size() < 2) ? answer : answer + tempLineList.get(0).size() - 1;
		tempLineList.get(1).retainAll(lineList.get(2));
		answer = (tempLineList.get(1).size() < 2) ? answer : answer + tempLineList.get(1).size() - 1;
		tempLineList.get(2).retainAll(lineList.get(0));
		answer = (tempLineList.get(2).size() < 2) ? answer : answer + tempLineList.get(2).size() - 1;
		tempLineList.get(0).retainAll(tempLineList.get(1));
		tempLineList.get(1).retainAll(tempLineList.get(2));
		answer = (tempLineList.get(0).size() < 2) ? answer : answer - tempLineList.get(0).size() + 1;
		answer = (tempLineList.get(1).size() < 2) ? answer : answer - tempLineList.get(1).size() + 1;
		return answer;
	}

	public int solution2(int[][] lines) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < lines.length; i++) {
			int min = Math.min(lines[i][0], lines[i][1]);
			int max = Math.max(lines[i][0], lines[i][1]);

			for (int j = min; j < max; j++) {
				map.put(j, map.getOrDefault(j, 0) + 1);
			}
		}

		int answer = 0;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 2) {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int[][] a = { { -1, 1 }, { 1, 3 }, { 3, 9 } };
		String[] d = { "def", "dww", "dzx", "loveaw" };
		System.out.println(new 겹치는선분의길이().solution(a));
	}
}
