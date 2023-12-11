package Sorting;

import java.util.Scanner;

public class InsertionSort {
	//새로운 카드를 이미 정렬된 앞부분과 비교하여 들어갈 위치를 찾아 삽입하는 방법 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		insert(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] insert(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int idx =i;
			for (int j = i-1; j >=0; j--) {
				if(arr[idx]<arr[j]) {
					int temp = arr[idx];
					arr[idx] = arr[j];
					arr[j] = temp;
					idx--;
				}
			}
		}
		
		return arr;
	}
	public static int[] insert1(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int temp =arr[i];
			int j=i-1;
			for (; j >=0; j--) {
				if(temp<arr[j]) {
					arr[j+1]=arr[j];
				}else break; //앞에는 이미 정렬되어있음
			}
			arr[j+1]=temp;
		}
		
		return arr;
	}

}
