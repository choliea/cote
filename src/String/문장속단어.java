package String;

import java.util.Scanner;

/*
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 */
public class 문장속단어 {

	public static String solution(String input1) {
		String answer ="";
		int max = 0;
		int index = 0;
		String[] list = input1.split(" ");
		for (int i = 0; i < list.length; i++) {
			if(max<list[i].length()) {
				max=list[i].length();
				index=i;
			}
		}
		answer =list[index];
		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.nextLine();
		String answer = solution(input1);
		System.out.println(answer);
		return;
	}

}
