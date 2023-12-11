package TwoPointer_SlidingWindow.copy;

import java.util.ArrayList;
import java.util.Scanner;

public class 두배열합치기 {
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();
		    int[] arr1 = new int[input1];
		    for (int i = 0; i < arr1.length; i++) {
				arr1[i] = in.nextInt();
			}
		    int input2 = in.nextInt();
		    int[] arr2 = new int[input2];
		    for (int i = 0; i < arr2.length; i++) {
		    	arr2[i] = in.nextInt();
		    }
		    int[] answer = solution(arr1, arr2);
		    for (int i = 0; i < answer.length; i++) {
				System.out.print(answer[i]+" ");
			}
		    return;
		  }

	private static int[] solution(int[] arr1, int[] arr2) {
		int[] answer = new int[arr1.length+arr2.length];
		int arr1Pointer = 0;
		int arr2Pointer = 0;
		
		for (int i = 0; i < answer.length; i++) {
			if(arr1Pointer<arr1.length&&arr1[arr1Pointer]<=arr2[arr2Pointer]) {
				answer[i] = arr1[arr1Pointer++];
			}else {
				answer[i]= arr2[arr2Pointer++];
			}
		}
		return answer;
	}
}
