package cote;
/*
A, B 두 사람이 가위바위보 게임을 합니다. 
총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다.
비길 경우에는 D를 출력합니다.
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
*/
import java.util.Scanner;
public class 가위바위보 {
	  
	  public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    int[] arr1 = new int[input1];
	    int[] arr2 = new int[input1];
	    for (int i = 0; i < input1; i++) {
	    	arr1[i] = in.nextInt();
		}
	    for (int i = 0; i < input1; i++) {
	    	arr2[i] = in.nextInt();
	    }
	    String[] answer = solution(input1,arr1,arr2);
	    for (int i = 0; i < answer.length; i++) {
	    	System.out.println(answer[i]);
		}
	    return ;
	}

	private static String[] solution(int input1, int[] arr1, int[] arr2) {
		String[] arr = new String[input1];
		for (int i = 0; i < arr.length; i++) {
			if(arr1[i]==1 &&arr2[i]==3) {
				arr[i] = "A";
			}else if(arr1[i]==3 &&arr2[i]==1) {
				arr[i] = "B";
			}else if(arr1[i]>arr2[i]) {
				arr[i] = "A";
			}else if(arr1[i]<arr2[i]){
				arr[i] = "B";
			}else if(arr1[i]==arr2[i]){
				arr[i]=  "D";
			}
		}
		return arr;
	}
}
