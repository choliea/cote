package TwoPointer_SlidingWindow.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소구하기 {
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
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    ArrayList<Integer> answer = solution(arr1, arr2);
		    for (int i = 0; i < answer.size(); i++) {
				System.out.print(answer.get(i)+" ");
			}
		    return;
		  }

	private static ArrayList<Integer> solution(int[] arr1, int[] arr2) {
		 ArrayList<Integer> answer = new ArrayList<Integer>();
		 int arr1idx = 0;
		 int arr2idx = 0;
		 for (int i = 0; i < arr2.length+arr1.length; i++) {
			if(arr1idx<arr1.length&&arr2idx<arr2.length&&arr1[arr1idx]==arr2[arr2idx]) {
				answer.add(arr1[arr1idx]);
				arr1idx++;
				arr2idx++;
			}else if(arr1idx<arr1.length&&arr2idx<arr2.length&&arr1[arr1idx]>arr2[arr2idx]) {
				arr2idx++;
			}else {
				arr1idx++;
			}
		}
		return answer;
	}
}
