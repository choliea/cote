package Sorting;

import java.util.Scanner;

public class SelectionSort {//가장 작은 숫자를 찾아서 교환
	//idx=0부터 n까지 최솟값을 가진 인덱스를 idx에 저장
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input2 = in.nextInt();
		    int[] arr = new int[input2];
		    for (int i = 0; i < input2; i++) {
				arr[i]=in.nextInt();
			}
		    int[] an=solution(arr);
		    for (int i = 0; i < an.length; i++) {
		    	System.out.print(an[i]+" ");
				
			}
		    return ;
		  }

	private static int[] solution(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int idx = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[idx]>arr[j]){
					idx=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[idx];
			arr[idx] = temp;
		}
		return arr;
	}
}
