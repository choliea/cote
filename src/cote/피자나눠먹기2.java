package cote;

import java.util.*;

public class 피자나눠먹기2 {
	public int solution(int n) {
		int m = n;
		if (n % 6 == 0)
			return n / 6;
		else {
			n += m;
			DFS(n, m);
		}
		return n / 6;
	}

	public int DFS(int n, int m) {
		if (n % 6 == 0)
			return n / 6;
		else {
			n += m;
			DFS(n, m);
		}
		return n / 6;
	}

	public int solution2(int n) {
		int answer = 1;

		while (true) {
			if (6 * answer % n == 0)
				break;
			answer++;
		}

		return answer;
	}
	 public int GCD(int num1, int num2) {
	        if (num1 % num2 == 0)
	            return num2;
	        return GCD(num2, num1 % num2);
	    }

	    public int LCM(int num1, int num2) {
	        return num1 * num2 / GCD(num1, num2);
	    }

	    public int solution3(int n) {
	        return LCM(n, 6) / 6;
	    }

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(new 피자나눠먹기2().solution(10));
	}
}
