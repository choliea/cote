package Set_Map.copy;

import java.util.HashSet;
import java.util.Scanner;

public class 매출액의종류 {
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    int input2 = in.nextInt();
	    int[] arr = new int[input1];
	    for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
	    int[] answer = new int[input1-input2+1];
	    answer = solution(input1,input2,arr);
	    for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	    return ;
	  }

	private static int[] solution(int input1,int input2, int[] arr) {
		int[] answer = new int[input1-input2+1];
		HashSet<Integer> a = new HashSet<Integer>();
		for (int j = 0; j < input2; j++) {
			a.add(arr[j]);
		}
		answer[0]=a.size();
		for (int i = 1; i < arr.length-input2+1; i++) {
			boolean isDuplicate=false;
			for(int j=i; j<i+input2-1;j++) {
				if(arr[j]==arr[i-1]) {
					isDuplicate=true;
					break;
					}
			}
			if(!isDuplicate) {
				a.remove(arr[i-1]);
			}
			
			a.add(arr[i+input2-1]);
			answer[i]=a.size();
		}
		return answer;
	}
}
