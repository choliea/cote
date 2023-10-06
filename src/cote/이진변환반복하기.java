package cote;

public class 이진변환반복하기 {
	public int[] solution(String s) {
		int[] answer = new int[2];
		int count = 0;
		int zero = 0;

		for (;;) {
			int length = s.length();
			s = s.replaceAll("0", "");
			zero += length - s.length();
			count++;
			s = Integer.toBinaryString(s.length());
			if (s.length() == 1)
				break;
		}
		answer[0] = count;
		answer[1] = zero;
		return answer;
	}

	public static void main(String[] args) {
		int[] answer = new 이진변환반복하기().solution("110010101001");
		System.out.println(answer[0] + " " + answer[1]);
	}
}
