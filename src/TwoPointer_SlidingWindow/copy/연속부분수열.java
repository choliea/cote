package TwoPointer_SlidingWindow.copy;

import java.util.Scanner;

public class 연속부분수열 {
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();
		    int input2 = in.nextInt();
		    int[] arr = new int[input1];
		    for (int i = 0; i < arr.length; i++) {
				arr[i] = in.nextInt();
			}
		    System.out.println(solution(arr,input2));
		    return ;
		  }

	private static int solution(int[] arr, int input2) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; sum < input2&&j<arr.length; j++) {
				sum+=arr[j];
			}
			if(sum==input2) {
				count++;
			}
		}
		return count;
	}
}
