package cote;

import java.util.*;

public class 팩토리얼 {
	public int solution(int n) {
		if (n == 0)
			return 0;
		int answer = 1;
		int f = 1;
		/*-*/
		return factorial(n, answer, f);
	}

	public int factorial(int n, int answer, int f) {
		f *= answer;
		if (n < f) {
			return answer - 1;
		} else if (n == f)
			return answer;
		return factorial(n, answer + 1, f);
	}

	public int solution2(int n) {
		int answer = 1;
		int m = 1;
		while (true) {
			m = m * answer;
			if (m < n) {
				answer++;
			} else if (m == n) {
				return answer;
			} else if (m > n) {
				return answer - 1;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(new 팩토리얼().solution2(7));
	}
}
