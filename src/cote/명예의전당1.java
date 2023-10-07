package cote;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class 명예의전당1 {

	public int[] solution2(int k, int[] score) {
		int[] answer = new int[score.length];

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

		int temp = 0;

		for (int i = 0; i < score.length; i++) {
			priorityQueue.add(score[i]);
			if (priorityQueue.size() > k) {
				priorityQueue.poll();
			}
			answer[i] = priorityQueue.peek();
		}
		return answer;
	}

	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		ArrayList<Integer> honors = new ArrayList<Integer>();

		for (int i = 0; i < score.length; i++) {
			if (i < k) {
				honors.add(score[i]);
				Collections.sort(honors);
			} else if (score[i] >= honors.get(0)) {
				honors.add(score[i]);
				Collections.sort(honors);
				honors.remove(0);
			}
			answer[i] = honors.get(0);
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] park = { "AN", "CF", "MJ", "RT", "NA" };
		int[] routes = { 10, 100, 20, 150, 1, 100, 200 };
		int[] answer = new 명예의전당1().solution2(3, routes);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
