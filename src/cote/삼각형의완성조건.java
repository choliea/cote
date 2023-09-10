package cote;

public class 삼각형의완성조건 {

	

	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i * i <= n; i++) {
			if (i * i == n) answer++;
			else if (n % i == 0) {
				answer+=2;
			}
		}
		return answer;
	}
	public int solution2(int n) {
		int answer = 0;
		boolean isSquare = false;
		for (int i = 1; i * i <= n; i++) {
			if (i * i == n)
				isSquare = true;
			if (n % i == 0) {
				answer++;
			}
		}
		answer *= 2;
		if (isSquare)
			answer--;
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(new 삼각형의완성조건().solution(100));
	}
}
