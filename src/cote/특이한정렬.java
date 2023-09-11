package cote;

import java.util.Arrays;

public class 특이한정렬 {

	public int[] solution(int[] numlist, int n) {
		int[] answer = new int[numlist.length];
		// n과의 차이
		Number[] nums = new Number[numlist.length];
		for (int i = 0; i < numlist.length; i++) {
			Number num = new Number(numlist[i], numlist[i] - n);
			nums[i] = num;
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			answer[i] = nums[i].data;
		}
		return answer;
	}

	class Number implements Comparable<Number> {
		int data;
		int diff;

		public Number(int data, int diff) {
			super();
			this.data = data;
			this.diff = diff;
		}

		@Override
		public int compareTo(Number o) {
			if (Math.abs(o.diff) < Math.abs(this.diff))
				return 1;
			else if (Math.abs(o.diff) == Math.abs(this.diff)) {
				if (o.diff < this.diff) {
					return -1;
				} else {
					return 1;
				}
			} else
				return -1;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(new 특이한정렬().solution(arr, 4));
	}
}
