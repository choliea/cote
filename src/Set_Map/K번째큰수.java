package Set_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class K번째큰수 {
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
		int sum=0;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				for (int k = j+1; k < arr.length; k++) {
					int tempSum=0;
					tempSum+=arr[k]+arr[j]+arr[i];
					set.add(tempSum);
				}
			}
		}
		int[] answer=new int[set.size()];
		Iterator<Integer> iterator = set.iterator();
		for (int i = 0; i < answer.length; i++) {
			answer[i] = iterator.next();
		}
		Arrays.sort(answer);
		if(input2>answer.length)return -1;
		sum=(int)answer[answer.length-input2];
		return sum;
	}
}
