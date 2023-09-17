package cote;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OX퀴즈 {

	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		for (int i = 0; i < quiz.length; i++) {
			String[] a = quiz[i].split(" ");
			if (a[1].equals("+")) {
				if (Integer.parseInt(a[0]) + Integer.parseInt(a[2]) == Integer.parseInt(a[4])) {
					answer[i] = "O";
				} else
					answer[i] = "X";
			} else {
				if (Integer.parseInt(a[0]) - Integer.parseInt(a[2]) == Integer.parseInt(a[4])) {
					answer[i] = "O";
				} else
					answer[i] = "X";
			}
		}
		return answer;
	}
	public String[] solution2(String[] quiz) {
		String[] answer = new String[quiz.length];
		for (int i = 0; i < quiz.length; i++) {
			String[] a = quiz[i].split(" ");
			answer[i]=(Integer.parseInt(a[0]) + Integer.parseInt(a[2])*((a[1].equals("+"))?1:-1) == Integer.parseInt(a[4]))? "O":"X";
		}
		return answer;
	}

	public static void main(String[] args) {
		int[][] a = { { 80, 70 }, { 90, 50 }, { 40, 70 }, { 50, 80 } };
		String[] d = { "3 - 4 = -3", "5 + 6 = 11", "-19 - 6 = 13", "-5 + 66 = -71", "5 - 15 = 63", "3 - 1 = -2" };
		System.out.println(new OX퀴즈().solution(d));
	}
}
