package Sorting;

import java.util.Scanner;

public class DuplicationSorting {
//주어진 배열에서 중복이 존재하면 D, 아니면 U 출력 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		char answer = 'U';
		if(duplication(arr)) {
			answer='D';
		}
		System.out.println(answer);
	}

	private static boolean duplication(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int idx = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[idx]==arr[j])return true;
				else if(arr[idx]>arr[j]) {
					idx = j;
				}
			}
				int temp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = temp;
		}
		return false;
	}
}
