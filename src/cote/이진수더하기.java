package cote;

import java.util.LinkedList;
import java.util.Queue;

public class 이진수더하기 {

	public String solution(String bin1, String bin2) {
		String answer = "";
		int sum=Integer.parseInt(bin1,2)+Integer.parseInt(bin2,2);
		answer=Integer.toBinaryString(sum);
		return answer;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		String[] d = { "def", "dww", "dzx", "loveaw" };
		System.out.println(new 이진수더하기().solution("10", "11"));
	}
}
