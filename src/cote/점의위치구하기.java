package cote;

import java.util.Arrays;

public class 점의위치구하기 {

	public int solution(int[] dot) {
		if(dot[0]>0&&dot[1]>0)return 1;
		else if(dot[0]<0&&dot[1]>0)return 2;
		else if(dot[0]<0&&dot[1]<0)return 3;
		else return 4;
		
	}
	public int solution2(int[] dot) {
		return dot[0]>0&&dot[1]>0 ? 1: dot[0]<0&&dot[1]>0 ? 2 : dot[0]<0&&dot[1]<0 ? 3: 4;
		
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4 };
		System.out.println(new 점의위치구하기().solution(arr));
	}
}
