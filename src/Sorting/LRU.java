package Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LRU {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int memoryLimit = in.nextInt();
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		ArrayList<Integer> answer = LRU(memoryLimit, arr);
		for (int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i) + " ");
		}
		arr = LRU1(memoryLimit, arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int[] LRU1(int memoryLimit, int[] arr) {
		int[] memory = new int[memoryLimit];
		for (int j = 0; j < arr.length; j++) {
			int k= memoryLimit - 1;;
			for (int i = 0; i < memory.length; i++) {
				if (memory[i] == arr[j]) {
					k = i;
					break;
				} 
			}
			for (; k >= 1; k--) {
				memory[k] = memory[k - 1];
			}
			memory[0] = arr[j];

		}
		return memory;
	}

	private static ArrayList<Integer> LRU(int memoryLimit, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!answer.contains(arr[i])) {
				answer.add(0, arr[i]);
			} else {
				answer.remove(answer.indexOf(arr[i]));
				answer.add(0, arr[i]);
			}
			if (answer.size() > memoryLimit) {
				answer.remove(memoryLimit);
			}
		}

		return answer;
	}
}
