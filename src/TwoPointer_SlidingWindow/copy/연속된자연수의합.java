package TwoPointer_SlidingWindow.copy;

import java.util.Scanner;

public class 연속된자연수의합 {
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();
		    System.out.println(solution(input1));
		    return ;
		  }

	private static int solution(int input1) {
		int answer =0;
		for (int i = 1; i < input1/2+1; i++) {
			int sum=0;
			for (int j = i; sum<input1&&j <= input1/2+1; j++) {
				sum+=j;
				if(sum==input1) {
					answer++;
				}
			}
		}
		return answer;
	}
}
