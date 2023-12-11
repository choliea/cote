package TwoPointer_SlidingWindow;

import java.util.Scanner;

public class 최대길이연속부분수열 {
	  public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();
		    int[] arr = new int[input1];
		    int input2 = in.nextInt();
		    for (int i = 0; i < arr.length; i++) {
				arr[i] = in.nextInt();
			}
		    System.out.println(solution(arr,input2));
		    return ;
		  }

	private static int solution(int[] arr, int input2) {
		int secondPointer=-1;
		int zeroCount=0; int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1) {
				
			}else if(arr[i]==0&&zeroCount<input2) {
				zeroCount++;
			}else if(arr[i]==0&&zeroCount==input2) {
				while(arr[++secondPointer]!=0) {
				}
			}
			int continuousCount=i-secondPointer;
			max=Math.max(max, continuousCount);
			
		}
		return max;
	}
}
