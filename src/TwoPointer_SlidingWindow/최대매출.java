package TwoPointer_SlidingWindow;

import java.util.Scanner;

public class 최대매출 {
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
		int answer=0;
		int sum=0;
		for (int j = 0; j < input2; j++) {
			sum+=arr[j];
		}
		answer=sum;
		for (int i = 0; i < arr.length-input2; i++) {
			sum=sum-arr[i]+arr[i+input2];
			answer=Math.max(answer, sum);
		}
		
		return answer;
	}
}
