package cote;

import java.util.ArrayList;
import java.util.Scanner;

/*
N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

첫 자리부터의 연속된 0은 무시한다.
 */
public class 뒤집은소수 {
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();
		    int[] list = new int[input1];
		    for (int i = 0; i < input1; i++) {
		    	list[i] = in.nextInt();
			}
		    ArrayList<Integer> answer = solution(list);
		    for (int i = 0; i < answer.size(); i++) {
		    	if(answer.get(i)!=1)
				System.out.print(answer.get(i)+" ");
			}
		    return ;
		  }

	private static ArrayList<Integer> solution(int[] list) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		list = reverse(list);
		for (int i = 0; i < list.length; i++) {
			if(list[i]!=2&&list[i]%2==0) {
				continue;
			}
			if(issosu(list[i])||list[i]==2) {
				answer.add(list[i]);
			}
		}
		return answer;
	}

	private static boolean issosu(int i) {
		boolean issosu = true;
		for (int j = 3; j*j <= i; j++) {
			if(i%j==0) {
				issosu = false;
				break;
			}
		}
		return issosu;
	}

	private static int[] reverse(int[] list) {
		
		for (int i = 0; i < list.length; i++) {
			char[] arr = (list[i]+"").toCharArray();
			for (int j = 0; j < arr.length/2; j++) {
				char temp = arr[j];
				arr[j] = arr[arr.length-j-1];
				arr[arr.length-j-1]=temp;
			}
			list[i] = Integer.parseInt(String.valueOf(arr));
		}
		return list;
	}
}
